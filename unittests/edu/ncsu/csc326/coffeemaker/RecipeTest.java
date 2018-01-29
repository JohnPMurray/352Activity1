package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;

public class RecipeTest extends TestCase {

	private Recipe rec;
	
	public void setUp() {
		this.rec = new Recipe();
	}
	
	public void tearDown() {
		this.rec = null;
	}
	
	/*
	 * Start of tests
	 */
	
	public void testSetAmtChocolateNegative() {
		try {
			this.rec.setAmtChocolate("-5");
			fail();
		} catch(RecipeException e){
			;
		}
	}
	
	public void testSetAmtChocolateZero() throws RecipeException {
		this.rec.setAmtChocolate("0");
		assertTrue(this.rec.getAmtChocolate() == 0);
	}
	
	public void testSetAmtChocolatePositive() throws RecipeException {
		this.rec.setAmtChocolate("10");
		assertTrue(this.rec.getAmtChocolate() == 10);
	}
	
	public void testSetAmtChocolateNonNumber() {
		try {
			this.rec.setAmtChocolate("M");
		} catch(RecipeException e){
			;
		}
	}
	
	public void testSetAmtChocolateEmpty() {
		try {
			this.rec.setAmtChocolate("");
			fail();
		} catch(RecipeException e){
			;
		}
	}
	
	public void testSetAmtChocolateNull() {
		try {
			this.rec.setAmtChocolate(null);
			fail();
		} catch(RecipeException e) {
			;
		}
	}
	
	public void testSetAmtChocolateNonInt() {
		try {
			this.rec.setAmtChocolate("2.6");
			fail();
		} catch(RecipeException e){
			;
		}
	}
	
	/*
	 * End of setAmtChocolate tests
	 */
	
	public void testSetAmtMilkNegative() {
		try {
			this.rec.setAmtMilk("-5");
			fail();
		} catch(RecipeException e){
			;
		}
	}
	
	public void testSetAmtMilkZero() throws RecipeException {
		this.rec.setAmtMilk("0");
		assertTrue(this.rec.getAmtMilk() == 0);
	}
	
	public void testSetAmtMilkPositive() throws RecipeException {
		this.rec.setAmtMilk("10");
		assertTrue(this.rec.getAmtMilk() == 10);
	}
	
	public void testSetAmtMilkNonNumber() {
		try {
			this.rec.setAmtMilk("M");
		} catch(RecipeException e){
			;
		}
	}
	
	public void testSetAmtMilkEmpty() {
		try {
			this.rec.setAmtMilk("");
			fail();
		} catch(RecipeException e){
			;
		}
	}
	
	public void testSetAmtMilkNull() {
		try {
			this.rec.setAmtMilk(null);
			fail();
		} catch(RecipeException e) {
			;
		}
	}
	
	public void testSetAmtMilkNonInt() {
		try {
			this.rec.setAmtMilk("6.6");
			fail();
		} catch(RecipeException e){
			;
		}
	}
	
	/*
	 * End of setAmtMilk tests
	 */
	
	public void testSetAmtCoffeeNegative() {
		try {
			this.rec.setAmtCoffee("-5");
			fail();
		} catch(RecipeException e){
			;
		}
	}
	
	public void testSetAmtCoffeeZero() throws RecipeException {
		this.rec.setAmtCoffee("0");
		assertTrue(this.rec.getAmtCoffee() == 0);
	}
	
	public void testSetAmtCoffeePositive() throws RecipeException {
		this.rec.setAmtCoffee("10");
		assertTrue(this.rec.getAmtCoffee() == 10);
	}
	
	public void testSetAmtCoffeeNonNumber() {
		try {
			this.rec.setAmtCoffee("M");
		} catch(RecipeException e){
			;
		}
	}
	
	public void testSetAmtCoffeeEmpty() {
		try {
			this.rec.setAmtCoffee("");
			fail();
		} catch(RecipeException e){
			;
		}
	}
	
	public void testSetAmtCoffeeNull() {
		try {
			this.rec.setAmtCoffee(null);
			fail();
		} catch(RecipeException e) {
			;
		}
	}
	
	public void testSetAmtCoffeeNonInt() {
		try {
			this.rec.setAmtCoffee("8.2");
			fail();
		} catch(RecipeException e){
			;
		}
	}
	
	/*
	 * End of setAmtCoffee tests
	 */
	
	public void testSetAmtSugarNegative() {
		try {
			this.rec.setAmtSugar("-5");
			fail();
		} catch(RecipeException e){
			;
		}
	}
	
	public void testSetAmtSugarZero() throws RecipeException {
		this.rec.setAmtSugar("0");
		assertTrue(this.rec.getAmtSugar() == 0);
	}
	
	public void testSetAmtSugarPositive() throws RecipeException {
		this.rec.setAmtSugar("10");
		assertTrue(this.rec.getAmtSugar() == 10);
	}
	
	public void testSetAmtSugarNonNumber() {
		try {
			this.rec.setAmtSugar("M");
		} catch(RecipeException e) {
			;
		}
	}
	
	public void testSetAmtSugarEmpty() {
		try {
			this.rec.setAmtSugar("");
			fail();
		} catch(RecipeException e) {
			;
		}
	}
	
	public void testSetAmtSugarNull() {
		try {
			this.rec.setAmtSugar(null);
			fail();
		} catch(RecipeException e) {
			;
		}
	}
	
	public void testSetAmtSugarNonInt() {
		try {
			this.rec.setAmtSugar("10.2");
			fail();
		} catch(RecipeException e) {
			;
		}
	}
	
	/*
	 * End of setAmtSugar tests
	 */
	
	public void testSetNameNull() {
		this.rec.setName(null);
		assertTrue(this.rec.getName().equals(""));
	}
	
	public void testSetNameLetters() {
		this.rec.setName("Lobster Rolls");
		assertTrue(this.rec.getName().equals("Lobster Rolls"));
	}
	
	public void testSetNameEmpty() {
		this.rec.setName("Lobster Pie");
		this.rec.setName("");
		
		assertTrue(this.rec.getName().equals("Lobster Pie"));
	}
	
	/*
	 * End of setName tests
	 */
	
	public void testSetPriceNegative() {
		try {
			this.rec.setPrice("-100");
			fail();
		} catch(RecipeException e) {
			;
		}
	}
	
	public void testSetPriceZero() throws RecipeException {
		this.rec.setPrice("0");
		assertTrue(this.rec.getPrice() == 0);
	}
	
	public void testSetPricePositive() throws RecipeException {
		this.rec.setPrice("100");
		assertEquals(100, this.rec.getPrice());
	}
	
	public void testSetPriceNonNumber() {
		try {
			this.rec.setPrice("D");
			fail();
		} catch(RecipeException e) {
			;
		}
	}
	
	public void testSetPriceEmpty() {
		try {
			this.rec.setPrice("");
			fail();
		} catch(RecipeException e) {
			;
		}
	}
	
	public void testSetPriceNull() {
		try {
			this.rec.setPrice(null);
			fail();
		} catch(RecipeException e) {
			;
		}
	}
	
	public void testSetPriceNonInt() {
		try {
			this.rec.setPrice("100.42");
			fail();
		} catch(RecipeException e) {
			;
		}
	}
	
	/*
	 * End of setPrice tests
	 */
	
	public void testHashCodeSameNameCaptialSmallLetters() {
		this.rec.setName("Lobster Rolls");
		
		Recipe rec2 = new Recipe();
		rec2.setName("lobster rolls");
		
		assertFalse(this.rec.hashCode() == rec2.hashCode());
	}
	
	public void testHashCodeDifferentNames() {
		this.rec.setName("Lobster Rolls");
		
		Recipe rec2 = new Recipe();
		rec2.setName("Chicken Parm");
		
		assertFalse(this.rec.hashCode() == rec2.hashCode());
	}
	
	public void testHashCodeOneNameEmpty() {
		this.rec.setName("Ice Chocolaate");
		
		Recipe rec2 = new Recipe();
		
		assertFalse(this.rec.hashCode() == rec2.hashCode());
	}
	
	/*
	 * End of hashCode tests
	 */
	
	public void testToString() {
		this.rec.setName("Chicken Alfredo");
		
		assertTrue(this.rec.toString().equals("Chicken Alfredo"));
	}
	
	/*
	 * End of toString tests
	 */
	
	public void testEqualsSameObj() {
		assertTrue(this.rec.equals(this.rec));
	}
	
	public void testEqualsNull() {
		assertFalse(this.rec.equals(null));
	}
	
	public void testEqualsDifferentClass() {
		assertFalse(this.rec.equals(new Inventory()));
	}
	
	public void testEqualsDifferentRecsSameName() {
		this.rec.setName("Lobster Rolls");
		
		Recipe rec2 = new Recipe();
		rec2.setName("Lobster Rolls");
		
		assertTrue(this.rec.equals(rec2));
	}
	
	public void testEqualsDifferentNames() {
		this.rec.setName("Lobster Rolls");
		
		Recipe rec2 = new Recipe();
		rec2.setName("Lobster Pie");
		
		assertFalse(this.rec.equals(rec2));
	}
	
	public void testEqualsSameEmpty() {
		Recipe rec2 = new Recipe();
		rec2.setName("");
		
		assertTrue(this.rec.equals(rec2));
	}
}
