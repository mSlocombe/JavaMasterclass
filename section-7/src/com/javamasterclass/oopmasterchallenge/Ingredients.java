package com.javamasterclass.oopmasterchallenge;

import java.util.ArrayList;
import java.util.HashMap;

public class Ingredients {
	private HashMap<String, Double> ingredientsList;
	private ArrayList<String> ingredientsAdded;

	public void addListedIngredient(String ingredient, double price) {
		ingredientsList.putIfAbsent(ingredient.toLowerCase(), price);
	}

	public void addIngredient(String ingredient) {
		if(ingredientsList.get(ingredient) != null) {
			ingredientsAdded.add(ingredient);
		}
	}


}
