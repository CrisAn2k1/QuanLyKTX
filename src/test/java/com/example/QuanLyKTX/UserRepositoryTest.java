package com.example.QuanLyKTX;

import static org.assertj.core.api.Assertions.assertThat;

import com.duongan.QuanLyKTX.model.User;
import com.duongan.QuanLyKTX.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import java.util.Date;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTest {
//    @Autowired
    private UserRepository repo;
    @Autowired
    private TestEntityManager entityManager;
    @Test
    public void testCreateUser(){
        User user = new User();
        user.setEmail("nhbtoan1503@gmail.com");
        user.setPassword("150301");
        user.setUsername("toan");
        user.setPhone("0934213424");
//        user.setNgaysinh('2001-03-15');

        user.setDiachi("HCM");
        user.setTruonghoc("Hutech");
        user.setQuyensudung("1");
//        user.setNgaytao("20011503");
        user.setIdPhong("P1008");
        User savedUser = repo.save(user);

        User existingUser = entityManager.find(User.class, savedUser.getId());

        assertThat(existingUser.getEmail()).isEqualTo(user.getEmail());
    }
}