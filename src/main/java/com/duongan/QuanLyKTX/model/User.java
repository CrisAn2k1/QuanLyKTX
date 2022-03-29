package com.duongan.QuanLyKTX.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;	
	private String password;
	@Column(nullable = false,unique = true)
	private String email;	
	private String phone;	
	private Date ngaysinh;	
	private String diachi;	
	private String truonghoc;	
	private String quyensudung;	
	private Date ngaytao;	
	private String avatar;	
	private String idPhong;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getTruonghoc() {
		return truonghoc;
	}

	public void setTruonghoc(String truonghoc) {
		this.truonghoc = truonghoc;
	}

	public String getQuyensudung() {
		return quyensudung;
	}

	public void setQuyensudung(String quyensudung) {
		this.quyensudung = quyensudung;
	}

	public Date getNgaytao() {
		return ngaytao;
	}

	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getIdPhong() {
		return idPhong;
	}

	public void setIdPhong(String idPhong) {
		this.idPhong = idPhong;
	}
}