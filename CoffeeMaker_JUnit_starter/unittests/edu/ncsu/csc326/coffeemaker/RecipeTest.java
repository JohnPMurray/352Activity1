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
    
    public void testsetnameActual() {
    	name = "Bob";
    	Rec.setName("Bob");
    	assertEquals(Rec.getName(),"Bob");
    }
    
    public void testnameEmpty() {
    	name = "";
    	Rec.setName("");
    	assertEquals(Rec.getName(),"");
    }
    
    public void testnameNull() {
    	name = null;
    	Rec.setName(name);
    	assertEquals(Rec.getName(),"");
    }
    
    public void testsetPriceInterger() throws RecipeException {
    	Rec.setPrice("1");
    	assertEquals(Rec.getPrice(),1);
    }
    public void testsetPriceCharacter() {
    	try {
    		Rec.setPrice("a");
    		fail("String must be a Number");
    	}
    	catch(RecipeException success) {    		
    	}
    }
    public void testsetPriceNegative(){
    	try {
    		Rec.setPrice("-1");
    		fail("String must be a Positive Number");
    	}
    	catch(RecipeException success) {    		
    	}
    }
}
