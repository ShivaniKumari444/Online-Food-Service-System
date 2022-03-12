package com.edu.OnlineFoodService.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="menuItem_Tbl")
public class MenuItem {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column
private long id;
@Column(name="name")
private String name;
@Column(name="price")
private String price;
@Column(name="quantity")
private String quantity;

@ManyToOne
@JoinColumn(name="menu_id")
private Menu menu;
}
