package com.edu.OnlineFoodService.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Admin_Tbl")
public class Admin {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column
private long id;
@Column(name="name")
private String name;
@Column(name="contact_number")
private String contact_Number;
@Column(name="email")
private String email;

	}

