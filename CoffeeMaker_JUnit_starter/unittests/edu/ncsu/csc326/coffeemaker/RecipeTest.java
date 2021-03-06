package edu.ncsu.csc326.coffeemaker;



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
    
    
    public void testHashcode_002() {
    	Rec.setName("a");
    	Rec2.setName("a");
    	assertTrue(Rec.hashCode() == Rec2.hashCode());
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
    public void testsetAmtChocolateDec(){
    	try {
    		Rec.setAmtChocolate("1.3");
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
    public void testsetAmtCoffeeDec(){
    	try {
    		Rec.setAmtCoffee("1.3");
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
    public void testsetAmtMilkDec(){
    	try {
    		Rec.setAmtMilk("1.3");
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

    public void testsetAmtSugarDec(){
    	try {
    		Rec.setAmtSugar("1.3");
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
    public void testsetPriceDec(){
    	try {
    		Rec.setPrice("1.3");
    		fail("String must be a Positive Number");
    	}
    	catch(RecipeException success) {    		
    	}
    }
    public void testequals_001() {
    	assertTrue(Rec.equals(Rec2));
    }
   
    public void testequals_002() {
    	Rec.setName(null);
    	Rec2.setName("Name");
    	assertFalse(Rec.equals(Rec2));
   }
  
    public void testequals_003() {
    	Rec.setName("Name");
    	assertFalse(Rec.equals(Rec2));
    }
    
    public void testequals_004() {
    	assertTrue(Rec.equals(Rec));
   }
    public void testequals_005() {
    	assertFalse(Rec.equals(null));
   }
    
    public void testequals_006() {
    	assertFalse(Rec.equals("text"));
    }
    
    public void testequals_007() {
    	Rec.setName("name");
    	Rec2.setName("name");
    	assertTrue(Rec.equals(Rec2));
    }
    
    public void testequals_008() throws RecipeException {
    	Rec.setName("name");
    	Rec.setAmtSugar("1");
    	Rec2.setName("name");
    	assertFalse(Rec.equals(Rec2));
    }
    public void testequals_009() throws RecipeException {
    	Rec.setName("name");
    	Rec.setAmtChocolate("1");
    	Rec2.setName("name");
    	assertFalse(Rec.equals(Rec2));
    }
    public void testequals_0010() throws RecipeException {
    	Rec.setName("name");
    	Rec.setAmtMilk("1");
    	Rec2.setName("name");
    	assertFalse(Rec.equals(Rec2));
    }
    public void testequals_011() throws RecipeException {
    	Rec.setName("name");
    	Rec.setAmtCoffee("1");
    	Rec2.setName("name");
    	assertFalse(Rec.equals(Rec2));
    }
    public void testequals_0012() throws RecipeException {
    	Rec.setName("name");
    	Rec.setPrice("1");
    	Rec2.setName("name");
    	assertFalse(Rec.equals(Rec2));
    }
 

 
    
}
