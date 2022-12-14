package com.scentofyou.scentofyou.domain;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@SuppressWarnings("serial")
@Entity
@Table(name="User")
@Data
@AllArgsConstructor 
@NoArgsConstructor
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="user_age")
	private int userAge;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_gender")
	private int userGender;
	
	@Column(name="user_phone")
	private String userPhone;
	
	@Column(name="user_pwd")
	private String userPwd;
	
}
