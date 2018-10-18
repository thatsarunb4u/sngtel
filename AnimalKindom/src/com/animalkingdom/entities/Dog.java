/**
 * 
 */
package com.animalkingdom.entities;

import com.animalkingdom.behavior.Singable;

/**
 * @author Arun
 * Dog that can sing
 *
 */
public class Dog implements Animal, Singable {

	/* (non-Javadoc)
	 * @see com.animalkingdom.behavior.Singable#sing()
	 */
	@Override
	public void sing() {
		System.out.println("Woof,woof");
	}

}
