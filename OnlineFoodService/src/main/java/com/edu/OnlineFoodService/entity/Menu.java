package com.edu.OnlineFoodService.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
@Data
@Entity
@Table(name="menu_Tbl")
public class Menu {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column
private long id;
@Column(name="category")
private String category;


@OneToMany(mappedBy="menu",cascade=CascadeType.ALL)
private List<MenuItem> menuItem;


@JsonBackReference
@ManyToOne
@JoinColumn(name= "restaurant_id")
private Restaurant restaurant;
                                                                                                                                               //private List<MenuItem> menuItem;
	}	

