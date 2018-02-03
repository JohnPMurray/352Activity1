package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;

public class RecipeTest extends TestCase {
	
	private String name;
    private int price;
    private int amtCoffee;
    private int amtMilk;
    private int amtSugar;
    private int amtChocolate;
    Recipe Rec = new Recipe();
    
    protected void setUp() {
    	this.name = Rec.getName();
    	this.price = Rec.getPrice();
    	this.amtCoffee = Rec.getAmtCoffee();
    	this.amtMilk = Rec.getAmtMilk();
    	this.amtSugar = Rec.getAmtSugar();
    	this.amtChocolate = Rec.getAmtChocolate();   	
    }
	
    protected void tearDown() {
    	this.name = "";
    	this.price = 0;
    	this.amtCoffee = 0;
    	this.amtMilk = 0;
    	this.amtSugar = 0;
    	this.amtChocolate = 0; 
    }

    public void testintialRecipe() {
    	assertEquals("Name is a empty string ", "", name);
    	assertEquals("Price is 0 ", 0, price);
    	assertEquals("Price is 0 ", 0, amtCoffee);
    	assertEquals("Price is 0 ", 0, amtMilk);
    	assertEquals("Price is 0 ", 0, amtSugar);
    	assertEquals("Price is 0 ", 0, amtChocolate);
    }
    
    public void testsetAmtChocolateInterger() throws RecipeException {
    	Rec.setAmtChocolate("1");
    	assertEquals(Rec.getAmtChocolate(),1);
    }
    public void testsetAmtChocolateCharacter() throws RecipeException {
    	try {
    		Rec.setAmtChocolate("a");
    		fail("String must be a Number");
    	}
    	catch(RecipeException success) {    		
    	}
    }
    public void testsetAmtChocolateNegative() throws RecipeException {
    	try {
    		Rec.setAmtChocolate("-1");
    		fail("String must be a Positive Number");
    	}
    	catch(RecipeException success) {    		
    	}
    }
}
