package com.javachallenge.challenge.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String firstName;
	private String lastName;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	private String city;
	private String coutnry;
	private String mobile;
	private String avatar;
	@Column(nullable=false, unique=true)
	private String username;
	@Column(nullable=false, unique=true)
	private String email;
	private String password;
	@Enumerated(EnumType.STRING)
	private UserRole role;

}