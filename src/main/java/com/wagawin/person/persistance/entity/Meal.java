package com.wagawin.person.persistance.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Meal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer id;

	@Column
	private String name;

	@Column
	private Date invented;

	@JsonIgnore
	@ManyToOne
	@JoinColumn
	private Child child;

	public Meal(String name, Date invented, Child child) {
		this.name = name;
		this.invented = invented;
		this.child = child;
	}

    public Meal() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getInvented() {
        return invented;
    }

    public void setInvented(Date invented) {
        this.invented = invented;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
