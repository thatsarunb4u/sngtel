/**
 * 
 */
package com.animalkingdom.entities;

import com.animalkingdom.behavior.Singable;

/**
 * @author Arun
 * A Rooster is a Bird that can sing. Its a sibling of Chicken
 *
 */
public class Rooster implements Bird, Singable {

	/* (non-Javadoc)
	 * @see com.animalkingdom.behavior.Singable#sing()
	 */
	@Override
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}

}
