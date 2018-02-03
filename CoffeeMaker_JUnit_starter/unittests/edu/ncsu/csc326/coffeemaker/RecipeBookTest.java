package edu.ncsu.csc326.coffeemaker;

import junit.framework.TestCase;


public class RecipeBookTest extends TestCase {
	
	private Recipe recipe1;
	private Recipe recipe2;
	private Recipe recipe3;
	private Recipe recipe4;
	private Recipe recipe5;
	private RecipeBook recipeBook;
	
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
	}
	
	//tests that get recipes returns an empty array
	public void testGetRecipes() {
		Recipe recipes[] = recipeBook.getRecipes();
		assertEquals(4, recipeBook.getRecipes().length);
	}
	
	public void testAddRecipe() {
		recipeBook.addRecipe(recipe1);
		assertSame(recipe1, recipeBook.getRecipes()[0]);
	}
	
	public void testAddNull() {
		recipeBook.addRecipe(null);
		assertSame(recipeBook.getRecipes()[0], null);
	}
	
	public void testAddSameRecipe() {
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe1);
		assertSame(recipe1, recipeBook.getRecipes()[0]);
	}
	
	public void testAddTwoRecipes() {
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe2);
		assertSame(recipe1, recipeBook.getRecipes()[0]);
		assertSame(recipe2, recipeBook.getRecipes()[1]);
	}
	
	public void testAddMaxRecipes() {
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe2);
		recipeBook.addRecipe(recipe3);
		recipeBook.addRecipe(recipe4);
		assertSame(recipe1, recipeBook.getRecipes()[0]);
		assertSame(recipe2, recipeBook.getRecipes()[1]);
		assertSame(recipe3, recipeBook.getRecipes()[2]);
		assertSame(recipe4, recipeBook.getRecipes()[3]);
	}
	
	public void testAddTooManyRecipes() {
		recipeBook.addRecipe(recipe1);
		recipeBook.addRecipe(recipe2);
		recipeBook.addRecipe(recipe3);
		recipeBook.addRecipe(recipe4);
		recipeBook.addRecipe(recipe5);
		assertSame(recipe1, recipeBook.getRecipes()[0]);
		assertSame(recipe2, recipeBook.getRecipes()[1]);
		assertSame(recipe3, recipeBook.getRecipes()[2]);
		assertSame(recipe4, recipeBook.getRecipes()[3]);
	}
	
	public void testDeleteRecipe() {
		recipeBook.addRecipe(recipe1);
		recipeBook.deleteRecipe(0);
		assertNotSame(recipe1, recipeBook.getRecipes()[0]);
	}
	
	public void testDeleteNonExistantRecipe() {
		recipeBook.deleteRecipe(0);
		assertSame(recipeBook.getRecipes()[0], null);
	}
	
	public void testDeleteAboveBounds() {
		recipeBook.addRecipe(recipe1);
		recipeBook.deleteRecipe(100000000);
		assertSame(recipe1, recipeBook.getRecipes()[0]);
	}
	
	public void testDeleteBelowBounds() {
		recipeBook.addRecipe(recipe1);
		recipeBook.deleteRecipe(-1);
		assertSame(recipe1, recipeBook.getRecipes()[0]);
	}
	
	public void testEditRecipe() {
		recipeBook.addRecipe(recipe1);
		recipeBook.editRecipe(0, recipe2);
		assertSame(recipe2, recipeBook.getRecipes()[0]);
	}
	
	public void testEditNonExistantRecipe() {
		recipeBook.editRecipe(0, recipe1);
		assertNotSame(recipe1, recipeBook.getRecipes()[0]);
	}
	
	public void testEditAboveBounds() {
		recipeBook.addRecipe(recipe1);
		recipeBook.editRecipe(100000000, recipe1);
		assertSame(recipe1, recipeBook.getRecipes()[0]);
	}	
		
	public void testEditBelowBounds() {
		recipeBook.addRecipe(recipe1);
		recipeBook.editRecipe(-1, recipe1);
		assertSame(recipe1, recipeBook.getRecipes()[0]);
	}

	public void testEditWithNull() {
		recipeBook.addRecipe(recipe1);
		recipeBook.editRecipe(0, null);
		assertSame(recipe1, recipeBook.getRecipes()[0]);
	}
	
	@Override
	protected void tearDown() {
		recipe1 = null;
		recipe2 = null;
		recipeBook = null;
		
	}
	
}
