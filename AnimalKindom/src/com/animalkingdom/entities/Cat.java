/**
 * 
 */
package com.animalkingdom.entities;

import com.animalkingdom.behavior.Singable;

/**
 * @author Arun
 * Cat that can sing
 *
 */
public class Cat implements Animal, Singable {

	/* (non-Javadoc)
	 * @see com.animalkingdom.behavior.Singable#sing()
	 */
	@Override
	public void sing() {
		System.out.println("Meow");
	}

}
