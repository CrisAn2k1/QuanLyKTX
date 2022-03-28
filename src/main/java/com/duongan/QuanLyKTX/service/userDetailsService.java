package com.duongan.QuanLyKTX.service;

import com.duongan.QuanLyKTX.mapper.UserMapper;
import com.duongan.QuanLyKTX.model.User;
import com.duongan.QuanLyKTX.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class userDetailsService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserExample  userExample= new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);

        List<User> listUser = userMapper.selectByExample(userExample);

        if(listUser.size()>0){
            User user = listUser.get(0);
            List<GrantedAuthority> granList = new ArrayList<GrantedAuthority>();
            GrantedAuthority authority = new SimpleGrantedAuthority("Admin");
            granList.add(authority);
            UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), granList);

            return userDetails;
        }
        else{
            new UsernameNotFoundException("Login fail!");
        }
        return null;
    }
}
