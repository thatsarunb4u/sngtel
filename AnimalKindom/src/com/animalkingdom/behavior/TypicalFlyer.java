/**
 * 
 */
package com.animalkingdom.behavior;

/**
 * @author Arun
 * This denotes a typical swimmer.
 * Since there is no variety of flying given in the requirements, 
 * we can create a concrete flying class with concrete flying 
 * behavior and it need not be an abstract class.
 *
 */
public class TypicalFlyer implements Flyable {

	@Override
	public void fly() {
		System.out.println("I am flying");		
	}


}
