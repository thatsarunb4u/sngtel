/**
 * 
 */
package com.animalkingdom.entities;

import com.animalkingdom.behavior.Singable;

/**
 * @author Arun
 * Phone is not an Animal. Its a non-living thing. But it can still sing!
 *
 */
public class Phone implements Singable {

	/* (non-Javadoc)
	 * @see com.animalkingdom.behavior.Singable#sing()
	 */
	@Override
	public void sing() {
		System.out.println("Tring,tring");

	}

}
