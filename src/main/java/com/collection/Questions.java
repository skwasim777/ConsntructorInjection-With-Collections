package com.collection;

import java.util.Iterator;
import java.util.List;

public class Questions {
	private int id;
	private String name;
	private List<Answers> answers;

	public Questions(int id, String name, List<Answers> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void desplay() {
		System.out.println(id + " " + name);
		System.out.println("answers are :");
		Iterator<Answers> itr = answers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
