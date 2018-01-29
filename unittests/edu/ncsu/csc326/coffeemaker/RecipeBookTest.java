package edu.ncsu.csc326.coffeemaker;

import junit.framework.TestCase;

public class RecipeBookTest extends TestCase {

	private Recipe rec0, rec1, rec2, rec3;
	private RecipeBook rb;
	
	public void setUp() {
		rec0 = new Recipe();
		rec1 = new Recipe();
		rec2 = new Recipe();
		rec3 = new Recipe();
		
		rec0.setName("rec0");
		rec1.setName("rec1");
		rec2.setName("rec2");
		rec3.setName("rec3");
		
		rb = new RecipeBook();
		
		this.rb.addRecipe(this.rec0);
		this.rb.addRecipe(this.rec1);
		this.rb.addRecipe(this.rec2);
		this.rb.addRecipe(this.rec3);
	}
	
	public void tearDown() {
		rec0 = null;
		rec1 = null;
		rec2 = null;
		rec3 = null;
		
		rb = null;
	}
	
	
	public void testAddRecipeOverFour() {
		assertFalse(this.rb.addRecipe(new Recipe()));
	}
	
	public void testAddRecipeSame() {
		assertFalse(this.rb.addRecipe(this.rec0));
	}
	
	public void testAddRecipe() {
		this.rb = new RecipeBook();
		
		this.rb.addRecipe(rec0);
		assertTrue(this.rb.getRecipes()[0].equals(this.rec0));
		
		this.rb.addRecipe(rec1);
		assertTrue(this.rb.getRecipes()[1].equals(this.rec1));
		
		this.rb.addRecipe(rec2);
		assertTrue(this.rb.getRecipes()[2].equals(this.rec2));
		
		this.rb.addRecipe(rec3);
		assertTrue(this.rb.getRecipes()[3].equals(this.rec3));
	}
	
	/*
	 * End of addRecipe tests
	 */
	
	public void testDeleteRecipeNegative() {
		this.rb.deleteRecipe(-1);
	}
	
	public void testDeleteRecipeBigNumber() {
		this.rb.deleteRecipe(10);
	}
	
	public void testDeleteRecipeLowBound() {
		String deletedRec = this.rb.deleteRecipe(0);
		
		assertTrue(deletedRec.equals(this.rec0.getName()));
	}
	
	public void testDeleteRecipeHighBound() {
		String deletedRec = this.rb.deleteRecipe(3);
		
		assertTrue(deletedRec.equals(this.rec3.getName()));
	}
	
	public void testDeleteRecipeEmptyPosition() {
		this.rb = new RecipeBook();
		
		this.rb.addRecipe(rec0);
		this.rb.addRecipe(rec1);
		
		String deletedRec = this.rb.deleteRecipe(2);
		
		assertTrue(deletedRec == null);
	}
	
	/*
	 * End of deleteRecipe tests
	 */
	
	public void testEditRecipeNull() {
		String editedRec = this.rb.editRecipe(0, null);
		
		assertTrue(editedRec == null);
	}
	
	public void testEditRecipeNegative() {
		String editedRec = this.rb.editRecipe(-1, new Recipe());
		
		assertTrue(editedRec == null);
	}
	
	public void testEditRecipeBigNumber() {
		String editedRec = this.rb.editRecipe(10, new Recipe());
		
		assertTrue(editedRec == null);
	}
	
	public void testEditRecipeLowBound() {
		String editedRec = this.rb.editRecipe(0, new Recipe());
		
		assertTrue(editedRec == this.rec0.getName());
	}
	
	public void testEditRecipeHighBound() {
		String editedRec = this.rb.editRecipe(3, new Recipe());
		
		assertTrue(editedRec == this.rec3.getName());
	}
	
	public void testEditRecipeEmptyPosition() {
		this.rb = new RecipeBook();
		
		this.rb.addRecipe(rec0);
		this.rb.addRecipe(rec1);
		
		String deletedRec = this.rb.editRecipe(2, new Recipe());
		
		assertTrue(deletedRec == null);
	}
	
	public void testEditRecipeMiddle() {
		String editedRec = this.rb.editRecipe(2, new Recipe());
		
		assertTrue(editedRec.equals(this.rec2.getName()));
	}
	
	public void testEditRecipePosition() {
		Recipe newRec = new Recipe();
		newRec.setName("Lobster Pie");
		
		this.rb.editRecipe(2, newRec);
		
		String editedRec = this.rb.getRecipes()[2].getName();
		
		assertTrue(editedRec.equals("Lobster Pie"));
	}
	
	/*
	 * End of editRecipe tests
	 */
}
