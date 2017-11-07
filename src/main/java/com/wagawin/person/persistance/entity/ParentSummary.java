package com.wagawin.person.persistance.entity;

import javax.persistence.*;

@Entity
public class ParentSummary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer id;

	@Column
	private Long amountOfPersons;

	@Column
	private Long amountOfChildren;

    public ParentSummary(Long amountOfPersons, Long amountOfChildren) {
        this.amountOfPersons = amountOfPersons;
        this.amountOfChildren = amountOfChildren;
    }

    public ParentSummary() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getAmountOfPersons() {
        return amountOfPersons;
    }

    public void setAmountOfPersons(Long amountOfPersons) {
        this.amountOfPersons = amountOfPersons;
    }

    public Long getAmountOfChildren() {
        return amountOfChildren;
    }

    public void setAmountOfChildren(Long amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }
}
