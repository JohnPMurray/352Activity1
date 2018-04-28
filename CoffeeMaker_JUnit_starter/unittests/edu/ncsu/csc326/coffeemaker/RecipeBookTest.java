package edu.ncsu.csc326.coffeemaker;

import junit.framework.TestCase;
import static org.mockito.Mockito.*;


public class RecipeBookTest extends TestCase {
	
	private Recipe recipe1;
	private Recipe recipe2;
	private Recipe recipe3;
	private Recipe recipe4;
	private Recipe recipe5;
	private RecipeBook recipeBook;
	
	@Override
	protected void setUp() {
		recipe1 = mock(Recipe.class);
		recipe2 = mock(Recipe.class);
		recipe3 = mock(Recipe.class);
		recipe4 = mock(Recipe.class);
		recipe5 = mock(Recipe.class);
		when(recipe1.getName()).thenReturn("recipe1");
		when(recipe2.getName()).thenReturn("recipe2");
		when(recipe3.getName()).thenReturn("recipe3");
		when(recipe4.getName()).thenReturn("recipe4");
		when(recipe5.getName()).thenReturn("recipe5");
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
		verify(recipe1).getName();
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
