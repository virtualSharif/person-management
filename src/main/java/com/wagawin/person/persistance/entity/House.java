package com.wagawin.person.persistance.entity;

import com.wagawin.person.business.enums.HouseType;

import javax.persistence.*;

@Entity
public class House {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer id;

	@Column
	private String address;

	@Column
	private String zipCode;

	@Column
	private HouseType houseType;

	@OneToOne
	@JoinColumn
	private Person person;

	public House(String address, String zipCode, HouseType houseType, Person person) {
		this.address = address;
		this.zipCode = zipCode;
		this.houseType = houseType;
		this.person = person;
	}

	public House() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
