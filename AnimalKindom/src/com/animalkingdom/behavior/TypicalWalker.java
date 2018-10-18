/**
 * 
 */
package com.animalkingdom.behavior;

/**
 * @author Arun
 * This denotes a typical walker.
 * Since there is no variety of walking given in the requirements, 
 * we can create a concrete walking class with concrete walking 
 * behavior and it need not be an abstract class.
 *
 */
public class TypicalWalker implements Walkable {

	/* (non-Javadoc)
	 * Default walking behaviour
	 */
	@Override
	public void walk() {
		System.out.println("I am walking");
	}

}
