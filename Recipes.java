package com.crome.RecipeBook;

import java.util.ArrayList;

public class Recipes implements Manage{
	private ArrayList<Item> recipes;
	
	public Recipes(){
		recipes = new ArrayList<Item>();
	}
	
	@Override
	public void addItem(Item i) {
		recipes.add(i);
	}
	
	@Override
	public void editItem(Item i) {
		for(Item r: recipes){
			if(r.getRecipeName().equals(i.getRecipeName())){
				recipes.remove(r);
				recipes.add((Ingredient)i);
			}
		}
	}

	@Override
	public void deleteItem(Item i) {
		for(Item r: recipes){
			if(r.getRecipeName().equals(i.getRecipeName())){
				recipes.remove(r);
			}
		}
	}

	@Override
	public Item getItem(String name) {
		Item it=null;
			for(Item r: recipes){
				if(r.getRecipeName().equals(name)){
					it=r;
				}
			}
			return it;
		}

		@Override
		public ArrayList<Item> getItems() {
			return recipes;
		}
}

