package com.collection;

public class Answers {
	private int id;
	private String name;
	private String by;

	public Answers(int id, String name, String by) {
		super();
		this.id = id;
		this.name = name;
		this.by = by;
	}

	@Override
	public String toString() {
		return "Answers [id=" + id + ", name=" + name + ", by=" + by + "]";
	}

}
