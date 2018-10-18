/**
 * 
 */
package com.animalkingdom.entities;

import java.util.ResourceBundle;

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
	
	public void singInNative(Language language) {
		ResourceBundle rb = ResourceBundle.getBundle("language");
		System.out.println(rb.getString("rooster.language."+language.name()));
	}

}
