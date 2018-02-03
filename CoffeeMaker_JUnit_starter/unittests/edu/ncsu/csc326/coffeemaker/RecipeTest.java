package edu.ncsu.csc326.coffeemaker;


import org.junit.Assert;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;

public class RecipeTest extends TestCase {
	
	private String name;
	private String empty;
    private int price;
    private int amtCoffee;
    private int amtMilk;
    private int amtSugar;
    private int amtChocolate;
    Recipe Rec = new Recipe();
    Recipe Rec2 = new Recipe();
    
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

    public void testintialRecipe_001() {
    	assertEquals("Name is a empty string ", "", name);
    }
    
    public void testintialRecipe_002() {
    	assertEquals("Price is 0 ", 0, price);
    }
    
    public void testintialRecipe_003() {
    	assertEquals("Price is 0 ", 0, amtCoffee);
    }
    
    public void testintialRecipe_004() {
    	assertEquals("Price is 0 ", 0, amtSugar);
    }
    
    public void testintialRecipe_005() {
    	assertEquals("Price is 0 ", 0, amtMilk);
    }
    
    public void testintialRecipe_006() {
    	assertEquals("Price is 0 ", 0, amtChocolate);
    }
    
    public void testsetAmtChocolateInterger() throws RecipeException{
    	Rec.setAmtChocolate("1");
    	assertEquals(Rec.getAmtChocolate(),1);
    }
    public void testsetAmtChocolateCharacter() {
    	try {
    		Rec.setAmtChocolate("a");
    		fail("String must be a Positive Number");
    	}
    	catch(RecipeException success) {    		
    	}
    }
    public void testsetAmtChocolateNegative(){
    	try {
    		Rec.setAmtChocolate("-1");
    		fail("String must be a Positive Number");
    	}
    	catch(RecipeException success) {    		
    	}
    }
    
    public void testsetAmtCoffeeInterger() throws RecipeException {
    	Rec.setAmtCoffee("1");
    	assertEquals(Rec.getAmtCoffee(),1);
    }
    public void testsetAmtCoffeeCharacter() {
    	try {
    		Rec.setAmtCoffee("a");
    		fail("String must be a Number");
    	}
    	catch(RecipeException success) {    		
    	}
    }
    public void testsetAmtCoffeeNegative(){
    	try {
    		Rec.setAmtCoffee("-1");
    		fail("String must be a Positive Number");
    	}
    	catch(RecipeException success) {    		
    	}
    }
    
    public void testsetAmtMilkInterger() throws RecipeException {
    	Rec.setAmtMilk("1");
    	assertEquals(Rec.getAmtMilk(),1);
    }
    public void testsetAmtMilkCharacter() {
    	try {
    		Rec.setAmtMilk("a");
    		fail("String must be a Number");
    	}
    	catch(RecipeException success) {    		
    	}
    }
    public void testsetAmtMilkNegative(){
    	try {
    		Rec.setAmtMilk("-1");
    		fail("String must be a Positive Number");
    	}
    	catch(RecipeException success) {    		
    	}
    }
    
    public void testsetAmtSugerInterger() throws RecipeException {
    	Rec.setAmtSugar("1");
    	assertEquals(Rec.getAmtSugar(),1);
    }
    public void testsetAmtSugarCharacter() {
    	try {
    		Rec.setAmtSugar("a");
    		fail("String must be a Number");
    	}
    	catch(RecipeException success) {    		
    	}
    }
    public void testsetAmtSugarNegative(){
    	try {
    		Rec.setAmtSugar("-1");
    		fail("String must be a Positive Number");
    	}
    	catch(RecipeException success) {    		
    	}
    }
    public void testtoString() {
    	empty = "";
    	assertEquals(Rec.toString(),empty);
    }
    public void testHashcode_001() {
    	assertTrue(Rec.hashCode() == Rec2.hashCode());
    }
}
