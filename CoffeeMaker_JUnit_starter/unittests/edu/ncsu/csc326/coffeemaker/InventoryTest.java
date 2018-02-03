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
    	//inv = new Inventory();
    	Rec = null;
    	inv = null;
    }
    
    public void testintialRecipe() {
    	inv.setChocolate(0);
    	
    	assertEquals("Chocolate is 0 ", 0, inv.getChocolate());
    	inv.setChocolate(-1);
    	assertEquals("Chocolate is not negative ", 0, inv.getChocolate());
    }
    
    public void testsetChocolate() {
    	inv.setChocolate(0);
    	
    	assertEquals("Chocolate is 0 ", 0, inv.getChocolate());
    	inv.setChocolate(1);
    	assertEquals("Chocolate is 1 ", 1, inv.getChocolate());
    	inv.setChocolate(-1);
    	assertEquals("Chocolate is still 1 ", 1, inv.getChocolate());
    }
    
    public void testsetCoffee() {
    	inv.setCoffee(0);   	
    	assertEquals("Coffee is 0 ", 0, inv.getCoffee());
    	inv.setCoffee(1);
    	assertEquals("Coffee is added ", 1, inv.getCoffee());
    	inv.setCoffee(-1);
    	assertEquals("Negative coffee is not added ", 1, inv.getCoffee());
    }
    
    public void testsetMilk() {
    	inv.setMilk(0);   	
    	assertEquals("Milk is 0 ", 0, inv.getMilk());
    	inv.setMilk(1);
    	assertEquals("Milk is added ", 1, inv.getMilk());
     	inv.setMilk(-1);
    	assertEquals("Negative milk is not added ", 1, inv.getMilk());
    }
    
    public void testsetSugar() {
    	inv.setSugar(0);   	
    	assertEquals("Sugar is 0 ", 0, inv.getSugar());
    	inv.setSugar(1);
    	assertEquals("Sugar is added ", 1, inv.getSugar());
    	inv.setSugar(-1);
    	assertEquals("Negative sugar is not added ", 1, inv.getSugar());
    }
    
    public void testaddChocolate() throws InventoryException {
    	inv.addChocolate("0");
    	assertEquals("Chocolate is 15 ", 15, inv.getChocolate());
    	inv.addChocolate("-1");
    	assertEquals("Negative chocolate is not added ", 15, chocolate);
    	inv.addChocolate("1");
    	assertEquals("Chocolate is added ", 16, chocolate);
    }
    
    public void testaddCoffee() throws InventoryException {
    	inv.addCoffee("0");   	
    	assertEquals("Coffee is 15 ", 15, inv.getCoffee());
    	inv.addCoffee("-1");
    	assertEquals("Negative coffee is not added ", 15, inv.getCoffee());
    	inv.addCoffee("1");
    	assertEquals("Coffee is added ", 16, inv.getCoffee());
    }
    
    public void testaddMilk() throws InventoryException {
    	inv.addMilk("0");   	
    	assertEquals("Milk is 15 ", 15, milk);
    	inv.addMilk("-1");
    	assertEquals("Negative milk is not added ", 15, milk);
    	inv.addMilk("1");
    	assertEquals("Milk is added ", 16, milk);
    }
    
    public void testaddSugar() throws InventoryException {
    	inv.addSugar("0");   	
    	assertEquals("Sugar is 15 ", 15, sugar);
    	inv.addSugar("-1");
    	assertEquals("Negative sugar is not added ", 15, sugar);
    	inv.addSugar("1");
    	assertEquals("Sugar is added ", 16, sugar);
    }
    

 /*   
    public void testenoughIngredience() {
    	inv.enoughIngredients(r);
    	
    }
*/
    public void testUseEnoughIngredients() throws RecipeException{
    		Rec.setAmtChocolate("1");
    		Rec.setAmtCoffee("2");
    		Rec.setAmtMilk("3");
    		Rec.setAmtSugar("4");
    		assertTrue(inv.useIngredients(Rec));
    		assertSame(chocolate - 1, inv.getChocolate());
    		assertSame(coffee - 2, inv.getCoffee());
    		assertSame(milk - 3, inv.getMilk());
    		assertSame(sugar - 4, inv.getSugar());
    }
    
    public void testUseTooMuchChocolate() throws RecipeException{
		Rec.setAmtChocolate("16");
		Rec.setAmtCoffee("2");
		Rec.setAmtMilk("3");
		Rec.setAmtSugar("4");
		assertFalse(inv.useIngredients(Rec));
		assertSame(chocolate, inv.getChocolate());
		assertSame(coffee, inv.getCoffee());
		assertSame(milk, inv.getMilk());
		assertSame(sugar, inv.getSugar());
    }
    
    public void testUseTooMuchMilk() throws RecipeException{
		Rec.setAmtChocolate("1");
		Rec.setAmtCoffee("2");
		Rec.setAmtMilk("16");
		Rec.setAmtSugar("4");
		assertFalse(inv.useIngredients(Rec));
		assertSame(chocolate, inv.getChocolate());
		assertSame(coffee, inv.getCoffee());
		assertSame(milk, inv.getMilk());
		assertSame(sugar, inv.getSugar());
    }
    
    public void testUseTooMuchCoffee() throws RecipeException{
		Rec.setAmtChocolate("1");
		Rec.setAmtCoffee("16");
		Rec.setAmtMilk("3");
		Rec.setAmtSugar("4");
		assertFalse(inv.useIngredients(Rec));
		assertSame(chocolate, inv.getChocolate());
		assertSame(coffee, inv.getCoffee());
		assertSame(milk, inv.getMilk());
		assertSame(sugar, inv.getSugar());
    }
    
    public void testUseTooMuchSugar() throws RecipeException{
		Rec.setAmtChocolate("1");
		Rec.setAmtChocolate("16");
		Rec.setAmtCoffee("2");
		Rec.setAmtMilk("3");
		Rec.setAmtSugar("16");
		assertFalse(inv.useIngredients(Rec));
		assertSame(chocolate, inv.getChocolate());
		assertSame(coffee, inv.getCoffee());
		assertSame(milk, inv.getMilk());
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
