package com.wagawin.person.persistance.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SON")
public class Son extends Child {

	@Column
	private String bicycleColor;

	public Son(String name, Integer age, Person person, String bicycleColor) {
		super(name, age, person);
		this.bicycleColor = bicycleColor;
	}

    public Son() {
    }

    public String getBicycleColor() {
		return bicycleColor;
	}

	public void setBicycleColor(String bicycleColor) {
		this.bicycleColor = bicycleColor;
	}
}
