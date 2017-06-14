package com.vamsi.challenge.q3;

import java.util.List;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data peopleData = new Data();
		peopleData.createPeople();
		List<Person> people = peopleData.getPeople();
		if (people != null) {
			for (Person p : people) {
				System.out.println(p);
				System.out.println();
			}
		} else {
			System.out.println("No data present. ");
		}
	}
}
