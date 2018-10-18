/**
 * 
 */
package com.animalkingdom.entities;

import com.animalkingdom.behavior.Flyable;
import com.animalkingdom.behavior.Singable;
import com.animalkingdom.behavior.TypicalWalker;

/**
 * @author thats
 *
 */
public class TypicalBird extends TypicalWalker implements Flyable, Singable {

	/* (non-Javadoc)
	 * @see com.animalkingdom.behavior.Flyable#fly()
	 */
	@Override
	public void fly() {
		System.out.println("I am flying");

	}
	
	/* (non-Javadoc)
	 * @see com.animalkingdom.behavior.Singable#sing()
	 */
	@Override
	public void sing() {
		System.out.println("I am singing.. La la la..");
	}

	

}
