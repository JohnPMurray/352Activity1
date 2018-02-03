package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;

public class InventoryTest extends TestCase {
	
    private int coffee;
    private int milk;
    private int sugar;
    private int chocolate;
    Inventory inv = new Inventory();
    Recipe Rec = new Recipe();
    
    protected void setUp() {
    	Rec = new Recipe();
    	inv = new Inventory();
    	this.coffee = inv.getCoffee();
    	this.milk = inv.getMilk();
    	this.sugar = inv.getSugar();
    	this.chocolate = inv.getChocolate();
    	
    }
	
    protected void tearDown() {
    	this.coffee = 0;
    	this.milk = 0;
    	this.sugar = 0;
    	this.chocolate = 0; 
    	Rec = null;
    	inv = null;
    }
    
    public void testGetCoffee() {
    		assertEquals("Coffee is not 15 ", 15, inv.getCoffee());
    }
    
    public void testGetMilk() {
    		assertEquals("Chocolate is not 15 ", 15, inv.getMilk());
    }
    
    public void testGetSugar() {
    		assertEquals("Sugar is not 15 ", 15, inv.getSugar());
    }
    
    public void testGetChocolate() {
    		assertEquals("Chocolate is not 15 ", 15, inv.getChocolate());
    }

    
    public void testsetChocolatePos() {
    	inv.setChocolate(0);	
    	assertEquals("Chocolate is not 0 ", 0, inv.getChocolate());
    }
    
    public void testsetChocolateNeg() {
    	inv.setChocolate(-1);	
    	assertEquals("Chocolate is not 15 ", 15, inv.getChocolate());
    }

    
    
    public void testsetCoffeePos() {
    	inv.setCoffee(0);   	
    	assertEquals("Coffee is 0 ", 0, inv.getCoffee());
    }
    
    public void testsetCoffeeNeg() {
    	inv.setCoffee(-1);
    	assertEquals("Negative coffee is not added ", 15, inv.getCoffee());
    }
    
    public void testsetMilkPos() {
    	inv.setMilk(0);   	
    	assertEquals("Milk is 0 ", 0, inv.getMilk());
    }
    
    public void testsetMilkNeg() {
     	inv.setMilk(-1);
    	assertEquals("Negative milk is not added ", 15, inv.getMilk());
    }
    
    public void testsetSugarPos() {
    	inv.setSugar(0);   	
    	assertEquals("Sugar is 0 ", 0, inv.getSugar());
    }
    
    public void testsetSugarNeg() {
    	inv.setSugar(-1);
    	assertEquals("Negative sugar is not added ", 15, inv.getSugar());
    }
    
    public void testaddChocolateSymb() {
    	try {
			inv.addChocolate("a");
			fail("Should throw inventory exception");
		} catch (InventoryException e) {
	    		assertEquals("Chocolate is 15 ", 15, inv.getChocolate());
			
		}
    	
    }
    
    public void testaddChocolateZ() {
    	try {
			inv.addChocolate("0");
		} catch (InventoryException e) {
			fail("Should not throw inventory exception");
			
		}
    	assertEquals("Chocolate is 15 ", 15, inv.getChocolate());
    	
    }
    
    public void testaddChocolateNeg() {

    	try {
			inv.addChocolate("-1");
			fail("Should throw inventory exception");
		} catch (InventoryException e) {
			assertEquals("Negative chocolate is added ", 15, inv.getChocolate());
			
		}
    	
    }
    
    public void testaddChocolatePos() {
    	try {
			inv.addChocolate("1");
		} catch (InventoryException e) {
			fail("Should not throw inventory exception");
			
		}
    	assertEquals("Chocolate is not added ", 16, inv.getChocolate());
    }
    
    public void testaddChocolateMax() {
    	try {
    		inv.setChocolate(Integer.MAX_VALUE);
			inv.addChocolate("1");
			fail("Should not throw inventory exception");
    	} catch (InventoryException e) {
			
		}
    	assertEquals("Chocolate should not overflow", Integer.MAX_VALUE, inv.getChocolate());
    }
    
    public void testaddCoffeeMax() {
    	try {
    		inv.setCoffee(Integer.MAX_VALUE);
			inv.addCoffee("1");
			fail("Should throw inventory exception");
		} catch (InventoryException e) {
			
			
		}   	
    	assertEquals("Coffee should not overflow", Integer.MAX_VALUE, inv.getCoffee());
    	
    }
    
    public void testaddMilkMax() {
    	try {
    		inv.setMilk(Integer.MAX_VALUE);
			inv.addMilk("1");
			fail("Should not throw inventory exception");
		} catch (InventoryException e) {
			
			
		}   	
    	assertEquals("Milk should not overflow", Integer.MAX_VALUE, inv.getMilk());
    	
    }
    
    public void testaddSugarMax()  {
    	try {
    		inv.setSugar(Integer.MAX_VALUE);
			inv.addSugar("1");
			fail("Should not throw inventory exception");
		} catch (InventoryException e) {
			
		}   	
    	assertEquals("Sugar should not overflow", Integer.MAX_VALUE, inv.getSugar());
    	
    }
    
    public void testaddCoffeeSymb() {
    	try {
			inv.addCoffee("a");
			fail("Should throw inventory exception");
		} catch (InventoryException e) {
	    		assertEquals("Coffee is not letter ", 15, inv.getCoffee());
		}   	  	
    }
    
    public void testaddCoffeeZ() {
    	try {
			inv.addCoffee("0");
		} catch (InventoryException e) {
			fail("Should not throw inventory exception");
			
		}   	
    	assertEquals("Coffee is not 15 ", 15, inv.getCoffee());
    	
    }
    
    public void testaddCoffeeNeg() {

    	try {
			inv.addCoffee("-1");
			fail("Should throw inventory exception");
		} catch (InventoryException e) {
			assertEquals("Negative coffee is added ", 15, inv.getCoffee());
		}
    	
    	
    }
    
    public void testaddCoffeePos() {

    	try {
			inv.addCoffee("1");
		} catch (InventoryException e) {
			fail("Should not throw inventory exception");
			
		}
    	assertEquals("Coffee is not added ", 16, inv.getCoffee());
    }
    
    public void testaddMilkSymb() {
    	try {
			inv.addMilk("a");
			fail("Should throw inventory exception");
		} catch (InventoryException e) {
			assertEquals("Milk is not letter ", 15, inv.getMilk());
			
		}   	
    	
    	
    }
    
    public void testaddMilkZ() {
    	try {
			inv.addMilk("0");
		} catch (InventoryException e) {
			fail("Should not throw inventory exception");
			
		}   	
    	assertEquals("Milk is not 15 ", 15, inv.getMilk());
    	
    }
    
    public void testaddMilkNeg() {

    	try {
			inv.addMilk("-1");
			fail("Should throw inventory exception");
		} catch (InventoryException e) {
			assertEquals("Negative Milk is added ", 15, inv.getMilk());
		}
    	
    	
    }
    
    public void testaddMilkPos() {

    	try {
			inv.addMilk("1");
		} catch (InventoryException e) {
			fail("Should not throw inventory exception");
			
		}
    	assertEquals("Milk is not added ", 16, inv.getMilk());
    }
    
    public void testaddSugarSymb()  {
    	try {
			inv.addSugar("a");
			fail("Should throw inventory exception");
		} catch (InventoryException e) {
			assertEquals("Sugar is not letter ", 15, inv.getSugar());
		}   	
    	
    }
    
    public void testaddSugarZ()  {
    	try {
			inv.addSugar("0");
		} catch (InventoryException e) {
			fail("Should not throw inventory exception");
		}   	
    	assertEquals("Sugar is not 15 ", 15, inv.getSugar());
    	
    }
    
    public void testaddSugarNeg()  {

    	try {
			inv.addSugar("-1");
			fail("Should throw inventory exception");
		} catch (InventoryException e) {
			assertEquals("Negative sugar is added ", 15, inv.getSugar());
			
		}
    	
    	
    }
    
    public void testaddSugarPos()  {

    	try {
			inv.addSugar("1");
		} catch (InventoryException e) {
			fail("Should not throw inventory exception");
			
		}
    	assertEquals("Sugar is not added ", 16, inv.getSugar());
    }
    

    public void testUseNothing() throws RecipeException{
		assertTrue(inv.useIngredients(Rec));
    }
    
    public void testUseNoSugar() throws RecipeException{
    		inv.useIngredients(Rec);
		assertSame(sugar, inv.getSugar());
    }
    
    public void testUseNoChocolate() throws RecipeException{
		inv.useIngredients(Rec);
	assertSame(chocolate, inv.getChocolate());
}
    
    public void testUseNoCoffee() throws RecipeException{
		inv.useIngredients(Rec);
	assertSame(coffee, inv.getCoffee());
}
    
    public void testUseNoMilk() throws RecipeException{
		inv.useIngredients(Rec);
	assertSame(milk, inv.getMilk());
}
    

    public void testUseAllChocolate() throws RecipeException{
		Rec.setAmtChocolate("15");
		assertTrue(inv.useIngredients(Rec));
		
    }
    
    public void testUseAllChocolateOutcome() throws RecipeException{
    		Rec.setAmtChocolate("15");
    		inv.useIngredients(Rec);
    		assertSame(0, inv.getChocolate());
    }
    
    public void testUseAllMilk() throws RecipeException{
		Rec.setAmtMilk("15");
		assertTrue(inv.useIngredients(Rec));
    }
    
    public void testUseAllMilkOutcome() throws RecipeException{
		Rec.setAmtMilk("15");
		inv.useIngredients(Rec);
		assertSame(0, inv.getMilk());
}

    
    public void testUseAllCoffee() throws RecipeException{
		Rec.setAmtCoffee("15");
		assertTrue(inv.useIngredients(Rec));
    }
    
    public void testUseAllCoffeeOutcome() throws RecipeException{
		Rec.setAmtCoffee("15");
		inv.useIngredients(Rec);
		assertSame(0, inv.getCoffee());
}

    
    public void testUseAllSugar() throws RecipeException{
		Rec.setAmtSugar("15");
		assertTrue(inv.useIngredients(Rec));
    }
    
    public void testUseAllSugarOutcome() throws RecipeException{
		Rec.setAmtSugar("15");
		inv.useIngredients(Rec);
		assertSame(0, inv.getSugar());
}

    
    public void testUseTooMuchChocolate() throws RecipeException{
		Rec.setAmtChocolate("16");
		assertFalse(inv.useIngredients(Rec));
    }
    
    public void testUseTooMuchChocolateOutcome() throws RecipeException{
		Rec.setAmtChocolate("16");
		inv.useIngredients(Rec);
		assertSame(chocolate, inv.getChocolate());
    }
    
    public void testUseTooMuchMilk() throws RecipeException{
		Rec.setAmtMilk("16");
		assertFalse(inv.useIngredients(Rec));
    }
    
    public void testUseTooMuchMilkOutcome() throws RecipeException{
		Rec.setAmtMilk("16");
		inv.useIngredients(Rec);
		assertSame(milk, inv.getMilk());
    }
    
    public void testUseTooMuchCoffee() throws RecipeException{
		Rec.setAmtCoffee("16");
		assertFalse(inv.useIngredients(Rec));
    }
    
    public void testUseTooMuchCoffeeOutcome() throws RecipeException{
		Rec.setAmtCoffee("16");
		inv.useIngredients(Rec);
		assertSame(coffee, inv.getCoffee());
    }
    
    public void testUseTooMuchSugar() throws RecipeException{
		Rec.setAmtSugar("16");
		assertFalse(inv.useIngredients(Rec));
    }
    
    public void testUseTooMuchSugarOutcome() throws RecipeException{
		Rec.setAmtSugar("16");
		inv.useIngredients(Rec);
		assertSame(sugar, inv.getSugar());
    }
    
    public void testToString() {
    		String strExpected = "Coffee: 15\n" + 
    				"Milk: 15\n" + 
    				"Sugar: 15\n" + 
    				"Chocolate: 15\n";
    		assertEquals(strExpected, inv.toString());

    }

}
