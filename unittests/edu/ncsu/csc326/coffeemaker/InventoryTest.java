package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;

public class InventoryTest extends TestCase {

	private Inventory inv;
	private Recipe rec;
	
	public void setUp() {
		this.inv = new Inventory();
		this.rec = new Recipe();
	}

	public void tearDown() {
		inv = null;
	}

	public void testGetChocolate() {
		assertTrue(this.inv.getChocolate() == 15);
	}

	public void testGetMilk() {
		assertTrue(this.inv.getMilk() == 15);
	}

	public void testGetSugar() {
		assertTrue(this.inv.getChocolate() == 15);
	}

	public void testGetCoffee() {
		assertTrue(this.inv.getMilk() == 15);
	}

	public void testSetChocolateNegative() {
		this.inv.setChocolate(-10);
		assertTrue(this.inv.getChocolate() == 15);
	}

	public void testSetChocolateZero() {
		this.inv.setChocolate(0);
		assertTrue(this.inv.getChocolate() == 0);
	}

	public void testSetChocolatePositive() {
		this.inv.setChocolate(5);
		assertTrue(this.inv.getChocolate() == 5);
	}

	/*
	 * End of setChocolate tests
	 */

	public void testSetMilkNegative() {
		this.inv.setMilk(-10);
		assertTrue(this.inv.getMilk() == 15);
	}

	public void testSetMilkZero() {
		this.inv.setMilk(0);
		assertTrue(this.inv.getMilk() == 0);
	}

	public void testSetMilkPositive() {
		this.inv.setMilk(5);
		assertTrue(this.inv.getMilk() == 5);
	}

	/*
	 * End of setMilk tests
	 */

	public void testSetCoffeeNegative() {
		this.inv.setCoffee(-10);
		assertTrue(this.inv.getCoffee() == 15);
	}

	public void testSetCoffeeZero() {
		this.inv.setCoffee(0);
		assertTrue(this.inv.getCoffee() == 0);
	}

	public void testSetCoffeePositive() {
		this.inv.setCoffee(5);
		assertTrue(this.inv.getCoffee() == 5);
	}

	/*
	 * End of setCoffee tests
	 */

	public void testSetSugarNegative() {
		this.inv.setSugar(-10);
		assertTrue(this.inv.getSugar() == 15);
	}

	public void testSetSugarZero() {
		this.inv.setSugar(0);
		assertTrue(this.inv.getSugar() == 0);
	}

	public void testSetSugarPositive() {
		this.inv.setSugar(5);
		assertTrue(this.inv.getSugar() == 5);
	}

	/*
	 * End of setSugar tests
	 */

	public void testAddChocolateNegative() {
		try {
			this.inv.addChocolate("-5");
			fail();
		} catch(InventoryException e) {
			;
		}
	}

	public void testAddChocolateZero() throws InventoryException {
		this.inv.addChocolate("0");
		assertTrue(this.inv.getChocolate() == 15);
	}

	public void testAddChocolatePositive() throws InventoryException {
		this.inv.addChocolate("5");
		assertTrue(this.inv.getChocolate() == 20);
	}

	public void testAddChocolateNonNumber() {
		try {
			this.inv.addChocolate("S");
			fail ();
		} catch(InventoryException e){
			;
		}
	}
	
	public void testAddChocolateEmpty() {
		try {
			this.inv.addChocolate("");
			fail();
		} catch(InventoryException e){
			;
		}
	}
	
	public void testAddChocolateNull() {
		try {
			this.inv.addChocolate(null);
			fail();
		} catch(InventoryException e){
			;
		}
	}
	
	public void testAddChocolateNonInt() {
		try {
			this.inv.addChocolate("1.6");
			fail();
		} catch(InventoryException e) {
			;
		}
	}

	/*
	 * End of addChocolate tests
	 */

	public void testAddMilkNegative() {
		try {
			this.inv.addMilk("-5");
			fail();
		} catch(InventoryException e) {
			;
		}
	}

	public void testAddMilkZero() throws InventoryException {
		this.inv.addMilk("0");
		assertTrue(this.inv.getMilk() == 15);
	}

	public void testAddMilkPositive() throws InventoryException {
		this.inv.addMilk("5");
		assertTrue(this.inv.getMilk() == 20);
	}

	public void testAddMilkNonNumber() {
		try {
			this.inv.addMilk("S");
			fail ();
		} catch(InventoryException e){
			;
		}
	}
	
	public void testAddMilkEmpty() {
		try {
			this.inv.addMilk("");
			fail();
		} catch(InventoryException e){
			;
		}
	}
	
	public void testAddMilkNull() {
		try {
			this.inv.addMilk(null);
			fail();
		} catch(InventoryException e){
			;
		}
	}
	
	public void testAddMilkNonInt() {
		try {
			this.inv.addMilk("1.6");
			fail();
		} catch(InventoryException e) {
			;
		}
	}

	/*
	 * End of addMilk tests
	 */

	public void testAddCoffeeNegative() {
		try {
			this.inv.addCoffee("-5");
			fail();
		} catch(InventoryException e) {
			;
		}
	}

	public void testAddCoffeeZero() throws InventoryException {
		this.inv.addCoffee("0");
		assertTrue(this.inv.getCoffee() == 15);
	}

	public void testAddCoffeePositive() throws InventoryException {
		this.inv.addCoffee("5");
		assertTrue(this.inv.getCoffee() == 20);
	}

	public void testAddCoffeeNonNumber() {
		try {
			this.inv.addCoffee("S");
			fail ();
		} catch(InventoryException e){
			;
		}
	}
	
	public void testAddCoffeeEmpty() {
		try {
			this.inv.addCoffee("");
			fail();
		} catch(InventoryException e){
			;
		}
	}
	
	public void testAddCoffeeNull() {
		try {
			this.inv.addCoffee(null);
			fail();
		} catch(InventoryException e){
			;
		}
	}
	
	public void testAddCoffeeNonInt() {
		try {
			this.inv.addCoffee("1.8");
			fail();
		} catch(InventoryException e){
			;
		}
	}

	/*
	 * End of addCoffee tests
	 */

	public void testAddSugarNegative() {
		try {
			this.inv.addSugar("-5");
			fail();
		} catch(InventoryException e) {
			;
		}
	}

	public void testAddSugarZero() throws InventoryException {
		this.inv.addSugar("0");
		assertTrue(this.inv.getSugar() == 15);
	}

	public void testAddSugarPositive() throws InventoryException {
		this.inv.addSugar("5");
		assertTrue(this.inv.getSugar() == 20);
	}

	public void testAddSugarNonNumber() {
		try {
			this.inv.addSugar("S");
			fail ();
		} catch(InventoryException e){
			;
		}
	}
	
	public void testAddSugarEmpty() {
		try {
			this.inv.addSugar("");
			fail();
		} catch(InventoryException e){
			;
		}
	}
	
	public void testAddSugarNull() {
		try {
			this.inv.addSugar(null);
			fail();
		} catch(InventoryException e){
			;
		}
	}
	
	public void testAddSugarNonInt() {
		try {
			this.inv.addSugar("1.8");
			fail();
		} catch(InventoryException e) {
			;
		}
	}

	/*
	 * End of addMilk tests
	 */

	
	public void testEnoughIngredientsOverChocolate() throws RecipeException {
		this.rec.setAmtChocolate("20");
		this.rec.setAmtCoffee("15");
		this.rec.setAmtSugar("15");
		this.rec.setAmtMilk("15");
		
		assertFalse(this.inv.enoughIngredients(this.rec));
	}
	
	public void testEnoughIngredientsOverMilk() throws RecipeException {
		this.rec.setAmtChocolate("15");
		this.rec.setAmtCoffee("15");
		this.rec.setAmtSugar("15");
		this.rec.setAmtMilk("20");
		
		assertFalse(this.inv.enoughIngredients(this.rec));
	}
	
	public void testEnoughIngredientsOverSugar() throws RecipeException {
		this.rec.setAmtChocolate("15");
		this.rec.setAmtCoffee("5");
		this.rec.setAmtSugar("30");
		this.rec.setAmtMilk("10");
		
		assertFalse(this.inv.enoughIngredients(this.rec));
	}
	
	public void testEnoughIngredientsOverCoffee() throws RecipeException {
		this.rec.setAmtChocolate("0");
		this.rec.setAmtCoffee("40");
		this.rec.setAmtSugar("1");
		this.rec.setAmtMilk("9");
		
		assertFalse(this.inv.enoughIngredients(this.rec));
	}
	
	public void testEnoughIngredientsOverAll() throws RecipeException {
		this.rec.setAmtChocolate("40");
		this.rec.setAmtCoffee("40");
		this.rec.setAmtSugar("100");
		this.rec.setAmtMilk("60");
		
		assertFalse(this.inv.enoughIngredients(this.rec));
	}
	
	public void testEnoughIngredientsUnderAll() throws RecipeException {
		this.rec.setAmtChocolate("8");
		this.rec.setAmtCoffee("12");
		this.rec.setAmtSugar("15");
		this.rec.setAmtMilk("10");
		
		assertTrue(this.inv.enoughIngredients(this.rec));
	}
	
	/*
	 * End of enoughIngredients tests
	 */
	
	public void testUseIngredientsOverChocolate() throws RecipeException {
		this.rec.setAmtChocolate("20");
		this.rec.setAmtCoffee("15");
		this.rec.setAmtSugar("15");
		this.rec.setAmtMilk("15");
		
		assertFalse(this.inv.useIngredients(this.rec));
	}
	
	public void testUseIngredientsOverMilk() throws RecipeException {
		this.rec.setAmtChocolate("15");
		this.rec.setAmtCoffee("15");
		this.rec.setAmtSugar("15");
		this.rec.setAmtMilk("20");
		
		assertFalse(this.inv.useIngredients(this.rec));
	}
	
	public void testUseIngredientsOverSugar() throws RecipeException {
		this.rec.setAmtChocolate("15");
		this.rec.setAmtCoffee("5");
		this.rec.setAmtSugar("30");
		this.rec.setAmtMilk("10");
		
		assertFalse(this.inv.useIngredients(this.rec));
	}
	
	public void testUseIngredientsOverCoffee() throws RecipeException {
		this.rec.setAmtChocolate("0");
		this.rec.setAmtCoffee("40");
		this.rec.setAmtSugar("1");
		this.rec.setAmtMilk("9");
		
		assertFalse(this.inv.useIngredients(this.rec));
	}
	
	public void testUseIngredientsOver() throws RecipeException {
		this.rec.setAmtChocolate("40");
		this.rec.setAmtCoffee("40");
		this.rec.setAmtSugar("100");
		this.rec.setAmtMilk("60");
		
		assertFalse(this.inv.useIngredients(this.rec));
	}
	
	public void testUseIngredientsUnderAll() throws RecipeException {
		this.rec.setAmtChocolate("8");
		this.rec.setAmtCoffee("12");
		this.rec.setAmtSugar("15");
		this.rec.setAmtMilk("10");
		
		if ( this.inv.useIngredients(this.rec) ){
			assertTrue(this.inv.getChocolate() == (15 - 8) );
			assertTrue(this.inv.getCoffee() == (15 - 12) );
			assertTrue(this.inv.getSugar() == (15 - 15) );
			assertTrue(this.inv.getMilk() == (15 - 10) );
		}
	}
	
	/*
	 * End of useIngredients tests
	 */
	
	public void testToStringIsEmpty() {
		assertTrue(this.inv.toString().length() >= 1);
	}
	
	public void testToStringFormat() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Coffee: " + this.inv.getCoffee() + "\n");
		buffer.append("Milk: " + this.inv.getMilk() + "\n");
		buffer.append("Sugar: " + this.inv.getSugar() + "\n");
		buffer.append("Chocolate: " + this.inv.getChocolate() + "\n");
		
		assertTrue(this.inv.toString().equals(buffer.toString()));
	}
}
