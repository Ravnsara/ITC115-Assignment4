package com.crome.RecipeBook;

public class Ingredient extends Item{
	
	private String amount;
	private int calories;private int fat;
	private int protein;
	private int carbohydrates;

	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getFat() {
		return fat;
	}
	public void setFat(int fat) {
		this.fat = fat;;
	}
	public int getProtein() {
		return protein;
	}
	public void setProtein(int protein) {
		this.protein = protein;;
	}
	public int getCarbohydrates() {
		return carbohydrates;
	}
	public void setCarbohydrates(int carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
}

