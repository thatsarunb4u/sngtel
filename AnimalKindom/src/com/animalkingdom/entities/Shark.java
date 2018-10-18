/**
 * 
 */
package com.animalkingdom.entities;

/**
 * @author Arun
 * A Shark is a fish, and a typical swimmer that is 
 */
public class Shark extends TypicalFish{
	
	public Shark(){
		setSize("Large");
		setColor("Grey");
	}
	
	public void eat(TypicalFish fish) {
		System.out.println("Shark:I am eating a typical fish:"+fish);
	}

}
