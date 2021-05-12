package com.revature.tree;

public class Tree {
	
	private int age;
	private String species;
	private int height;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	public Tree() {
		super();
	}
	
	public Tree(int age, String species, int height) {
		super();
		this.age = age;
		this.species = species;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Tree [age=" + age + ", species=" + species + ", height=" + height + " feet]";
	}
}
