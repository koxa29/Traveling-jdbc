package com.epam.preprod.traveling.domain.analitic;

import com.epam.preprod.traveling.domain.person.Person;

public class Analitic extends Person {
	private Integer id;
	private String possition;

	public Analitic() {
	}

	public Analitic(String firstName, String secondName, String email,
			String password, Integer id, String possition) {
		super(firstName, secondName, email, password);
		this.id = id;
		this.possition = possition;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPossition() {
		return possition;
	}

	public void setPossition(String possition) {
		this.possition = possition;
	}

	@Override
	public String toString() {
		return "Analitic [id=" + id + ", " + super.toString() + ", possition="
				+ possition + "]";
	}

}
