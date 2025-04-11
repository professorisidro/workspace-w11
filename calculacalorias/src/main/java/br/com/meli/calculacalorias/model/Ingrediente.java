package br.com.meli.calculacalorias.model;

public class Ingrediente {
	private String name;
	private int    calories;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	@Override
	public String toString() {
		return "Ingrediente [name=" + name + ", calories=" + calories + "]\n";
	}
	
	
}
