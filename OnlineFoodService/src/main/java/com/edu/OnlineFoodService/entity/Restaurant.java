package com.edu.OnlineFoodService.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="rest_Tbl")
public class Restaurant {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column
private long id;
@Column(name="name")
private String name;
@Column(name="location")
private String location;


@OneToMany(mappedBy="restaurant",cascade=CascadeType.ALL)
private List<Menu> menu;
}
