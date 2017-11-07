package com.wagawin.person.persistance.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("DAUGHTER")
public class Daughter extends Child {

	@Column
	private String hairColor;

    public Daughter() {
    }

    public Daughter(String name, Integer age, Person person, String hairColor) {
		super(name, age, person);
		this.hairColor = hairColor;
	}

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
