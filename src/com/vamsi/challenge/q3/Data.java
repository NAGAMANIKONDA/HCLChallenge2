package com.vamsi.challenge.q3;

import java.util.ArrayList;
import java.util.List;

public class Data {
	private List<Person> people = new ArrayList<Person>();

	public void createPeople() {
		this.people.add(new Person(1, "sekhar Rongali", "682-456-7890", "4800 haverwood lane, Dallas, TX, 75287"));
		this.people.add(new Person(2, "karunya Kishore ", "204-222-3333", "4804 Haverwod Lane, Dallas, TX, 75287"));
		this.people.add(new Person(3, "Jay", "408-989-7484", "4545 kansas city 64112"));
		this.people.add(new Person(4, "kailash", "518-357-3429", "234 hustin Aven Austin 23412"));
		this.people.add(new Person(5, "Stephen Curry", "303-665-9990", "Gsw hops California 45453"));
		this.people.add(new Person(6, "Kaly Thompson", "818-668-2376", "123 Simspson St, Washington DC, 12345"));
	}

	public List<Person> getPeople() {
		return people;
	}

}
