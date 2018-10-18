/**
 * 
 */
package com.animalkingdom.behavior;

/**
 * @author Arun
 * This denotes a typical swimmer.
 * Since there is no variety of swimming given in the requirements, 
 * we can create a concrete swimming class with concrete swimming 
 * behavior and it need not be an abstract class.
 *
 */
public class TypicalSwimmer implements Swimmable {

	/* (non-Javadoc)
	 * Default walking behaviour
	 */
	@Override
	public void swim() {
		System.out.println("I am swimming");
	}

}
