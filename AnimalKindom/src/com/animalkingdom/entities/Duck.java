/**
 * 
 */
package com.animalkingdom.entities;

import com.animalkingdom.behavior.Singable;
import com.animalkingdom.behavior.TypicalSwimmer;

/**
 * @author Arun
 * A Duck that is a Bird, that can sing and swim
 */
public class Duck extends TypicalSwimmer implements Bird, Singable{

	/* (non-Javadoc)
	 * @see com.animalkingdom.behavior.Singable#sing()
	 */
	@Override
	public void sing() {
		System.out.println("Quack, quack");
	}

}
