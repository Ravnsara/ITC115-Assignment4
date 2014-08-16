package com.crome.RecipeBook;

import java.util.ArrayList;

public class Recipe extends Item implements Manage{
	private String instructions;
	private ArrayList<Item> ingredients;
	
	public Recipe(){
		ingredients = new ArrayList<Item>();
	}
	public String getInstructions() {
		return instructions;
	}
	
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	@Override
	public void addItem(Item i) {
		ingredients.add(i);
	}

	@Override
	public void editItem(Item i){
		for(Item r: ingredients){
			if(r.getRecipeName().equals(i.getRecipeName())){
				ingredients.remove(r);
				ingredients.add((Ingredient)i);
			}
		}
	}

	@Override
	public void deleteItem(Item i) {
		for(Item r: ingredients){
			if(r.getRecipeName().equals(i.getRecipeName())){
				ingredients.remove(r);
			}
		}
	}

	@Override
	public Item getItem(String name) {
		Item it = null;
		for(Item r: ingredients){
			if(r.getRecipeName().equals(name)){
			it = r;
			}
		}
			return it;
	}

	@Override
	public ArrayList<Item> getItems(){
		 return ingredients;
	 }
}

