package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import junit.framework.TestCase;

public class InventoryTest extends TestCase {
	
    private int coffee;
    private int milk;
    private int sugar;
    private int chocolate;
    Inventory inv;
    Recipe Rec;
    
    protected void setUp() {
    	Rec = new Recipe();
    	inv = new Inventory();
    	this.coffee = inv.getCoffee();
    	this.milk = 15;
    	this.sugar = inv.getSugar();
    	this.chocolate = 15;
    	
    	
    }
	
    protected void tearDown() {
    	this.coffee = 0;
    	this.milk = 0;
    	this.sugar = 0;
    	this.chocolate = 0; 
    	Rec = null;
    	inv = null;
    }
    

    
    public void testsetChocolatePos() {
    	inv.setChocolate(0);	
    	assertEquals("Chocolate is not 0 ", 0, inv.getChocolate());
    }

    public void testsetChocolateNeg() {
    	inv.setChocolate(-1);
    	assertEquals("Chocolate is negative ", 15, inv.getChocolate());
    }
    
    public void testsetCoffeePos() {
    	inv.setCoffee(0);   	
    	assertEquals("Coffee is not 0 ", 0, inv.getCoffee());
    }
    
    public void testsetCoffeeNeg() {
    	inv.setCoffee(-1);
    	assertEquals("Coffee is negative ", 15, inv.getCoffee());
    }
    
    public void testsetMilkPos() {
    	inv.setMilk(0);   	
    	assertEquals("Milk is not 0 ", 0, inv.getMilk());
    }
    
    public void testsetMilkNeg() {
     	inv.setMilk(-1);
    	assertEquals("Milk is negative ", 15, inv.getMilk());
    }
    
    public void testsetSugarPos() {
    	inv.setSugar(0);   	
    	assertEquals("Sugar is not 0 ", 0, inv.getSugar());
    }
    
    public void testsetSugar() {
    	inv.setSugar(-1);
    	assertEquals("Sugar is negative ", 15, inv.getSugar());
    }
    
    public void testaddChocolateZ() {
    	try {
			inv.addChocolate("0");
		} catch (InventoryException e) {
			// TODO Auto-generated catch block
			
		}
    	assertEquals("Chocolate is 15 ", 15, inv.getChocolate());
    	
    }
    
    public void testaddChocolateNeg() {

    	try {
			inv.addChocolate("-1");
		} catch (InventoryException e) {
			// TODO Auto-generated catch block
			
		}
    	assertEquals("Negative chocolate is added ", 15, inv.getChocolate());
    	
    }
    
    public void testaddChocolatePos() {
    	try {
			inv.addChocolate("1");
		} catch (InventoryException e) {
			// TODO Auto-generated catch block
			
		}
    	assertEquals("Chocolate is not added ", 16, inv.getChocolate());
    }
    
    public void testaddCoffeeZ() {
    	try {
			inv.addCoffee("0");
		} catch (InventoryException e) {
			// TODO Auto-generated catch block
			
		}   	
    	assertEquals("Coffee is not 15 ", 15, inv.getCoffee());
    	
    }
    
    public void testaddCoffeeNeg() {

    	try {
			inv.addCoffee("-1");
		} catch (InventoryException e) {
			// TODO Auto-generated catch block
			
		}
    	assertEquals("Negative coffee is added ", 15, inv.getCoffee());
    	
    }
    
    public void testaddCoffeePos() {

    	try {
			inv.addCoffee("1");
		} catch (InventoryException e) {
			// TODO Auto-generated catch block
			
		}
    	assertEquals("Coffee is not added ", 16, inv.getCoffee());
    }
    
    public void testaddMilkZ() {
    	try {
			inv.addMilk("0");
		} catch (InventoryException e) {
			// TODO Auto-generated catch block
			
		}   	
    	assertEquals("Milk is not 15 ", 15, inv.getMilk());
    	
    }
    
    public void testaddMilkNeg() {

    	try {
			inv.addMilk("-1");
		} catch (InventoryException e) {
			// TODO Auto-generated catch block
			
		}
    	assertEquals("Negative Milk is added ", 15, inv.getMilk());
    	
    }
    
    public void testaddMilkPos() {

    	try {
			inv.addMilk("1");
		} catch (InventoryException e) {
			// TODO Auto-generated catch block
			
		}
    	assertEquals("Milk is not added ", 16, inv.getMilk());
    }
    
    public void testaddSugarZ()  {
    	try {
			inv.addSugar("0");
		} catch (InventoryException e) {
			// TODO Auto-generated catch block
		}   	
    	assertEquals("Sugar is not 15 ", 15, inv.getSugar());
    	
    }
    
    public void testaddSugarNeg()  {

    	try {
			inv.addSugar("-1");
		} catch (InventoryException e) {
			// TODO Auto-generated catch block
			
		}
    	assertEquals("Negative sugar is added ", 15, inv.getSugar());
    	
    }
    
    public void testaddSugarPos()  {

    	try {
			inv.addSugar("1");
		} catch (InventoryException e) {
			// TODO Auto-generated catch block
			
		}
    	assertEquals("Sugar is not added ", 16, inv.getSugar());
    }
    

 /*   
    public void testenoughIngredience() {
    	inv.enoughIngredients(r);
    	
    }
*/

}
