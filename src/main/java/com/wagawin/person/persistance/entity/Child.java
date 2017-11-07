package com.wagawin.person.persistance.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorColumn(name = "type")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Child {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer id;

	@Column
	private String name;

	@Column
	private Integer age;

	@ManyToOne
	@JoinColumn
	private Person person;


	public Child(String name, Integer age, Person person) {
		this.name = name;
		this.age = age;
		this.person = person;
	}

    public Child() {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
