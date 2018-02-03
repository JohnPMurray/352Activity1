package edu.ncsu.csc326.coffeemaker;

import junit.framework.TestCase;


public class RecipeBookTest extends TestCase {
	
	private Recipe recipe1;
	private Recipe recipe2;
	private Recipe recipe3;
	private Recipe recipe4;
	private Recipe recipe5;
	private RecipeBook recipeBook;
	Recipe expectedRecipes[];
	
	@Override
	protected void setUp() {
		recipe1 = new Recipe();
		recipe2 = new Recipe();
		recipe3 = new Recipe();
		recipe4 = new Recipe();
		recipe5 = new Recipe();
		recipe1.setName("recipe1");
		recipe2.setName("recipe2");
		recipe3.setName("recipe3");
		recipe4.setName("recipe4");
		recipe5.setName("recipe5");
		recipeBook = new RecipeBook();
		expectedRecipes = new Recipe[4];
	}
	
	//tests that get recipes returns an empty array
	public void testGetRecipes() {
		Recipe recipes[] = recipeBook.getRecipes();
		assertSame(expectedRecipes, recipes);
	}
	
	public void testAddRecipe() {
		recipeBook.addRecipe(recipe1);
		expectedRecipes[0] = recipe1;
		assertSame(expectedRecipes, recipeBook.getRecipes());
	}
	
	public void testAddSameRecipe() {
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe1);
		expectedRecipes[0] = recipe1;
		assertSame(expectedRecipes, recipeBook.getRecipes());
	}
	
	public void testAddTwoRecipes() {
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe2);
		expectedRecipes[0] = recipe1;
		expectedRecipes[1] = recipe2;
		assertSame(expectedRecipes, recipeBook.getRecipes());
	}
	
	public void testAddMaxRecipes() {
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe2);
		recipeBook.addRecipe(recipe3);
		recipeBook.addRecipe(recipe4);
		expectedRecipes[0] = recipe1;
		expectedRecipes[1] = recipe2;
		expectedRecipes[2] = recipe3;
		expectedRecipes[3] = recipe4;
		assertSame(expectedRecipes, recipeBook.getRecipes());
	}
	
	public void testAddTooManyRecipes() {
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe2);
		recipeBook.addRecipe(recipe3);
		recipeBook.addRecipe(recipe4);
		recipeBook.addRecipe(recipe5);
		expectedRecipes[0] = recipe1;
		expectedRecipes[1] = recipe2;
		expectedRecipes[2] = recipe3;
		expectedRecipes[3] = recipe4;
		assertSame(expectedRecipes, recipeBook.getRecipes());
	}
	
	public void testDeleteRecipe() {
		recipeBook.addRecipe(recipe1);
		recipeBook.deleteRecipe(0);
		assertSame(expectedRecipes, recipeBook.getRecipes());
	}
	
	public void testDeleteNonExistantRecipe() {
		recipeBook.deleteRecipe(0);
		assertSame(expectedRecipes, recipeBook.getRecipes());
	}
	
	public void testDeleteOutOfBounds() {
		recipeBook.addRecipe(recipe1);
		recipeBook.deleteRecipe(100000000);
		expectedRecipes[0] = recipe1;
		assertSame(expectedRecipes, recipeBook.getRecipes());
	}
	
	public void testEditRecipe() {
		recipeBook.addRecipe(recipe1);
		recipeBook.editRecipe(0, recipe2);
		expectedRecipes[0] = recipe2;
		assertSame(expectedRecipes, recipeBook.getRecipes());
	}
	
	public void testEditNonExistantRecipe() {
		recipeBook.editRecipe(0, recipe1);
		assertSame(expectedRecipes, recipeBook.getRecipes());
	}
	
	public void testEditOutOfBounds() {
		recipeBook.addRecipe(recipe1);
		recipeBook.editRecipe(100000000, recipe1);
		expectedRecipes[0] = recipe1;
		assertSame(expectedRecipes, recipeBook.getRecipes());
	}
	
	@Override
	protected void tearDown() {
		recipe1 = null;
		recipe2 = null;
		recipeBook = null;
		expectedRecipes = null;
		
	}
	
}
