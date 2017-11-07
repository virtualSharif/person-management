package com.wagawin.person.business.dto;

import com.wagawin.person.persistance.entity.Meal;
import com.wagawin.person.persistance.entity.Person;

public class ChildInfoDTO {

	private Person parent;
	private Meal favoriteMeal;

	public ChildInfoDTO() {
	}

	public ChildInfoDTO(Person parent, Meal favoriteMeal) {
		this.parent = parent;
		this.favoriteMeal = favoriteMeal;
	}

	public Person getParent() {
		return parent;
	}

	public void setParent(Person parent) {
		this.parent = parent;
	}

	public Meal getFavoriteMeal() {
		return favoriteMeal;
	}

	public void setFavoriteMeal(Meal favoriteMeal) {
		this.favoriteMeal = favoriteMeal;
	}
}
