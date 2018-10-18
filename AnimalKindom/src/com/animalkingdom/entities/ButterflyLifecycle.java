/**
 * 
 */
package com.animalkingdom.entities;

/**
 * @author Arun
 * This is typically a butterfly class. 
 * It changes its behavior depending on what stage the butterfly is.
 */
public class ButterflyLifecycle implements Insect {

	Insect butterflyState;
	
	public void morph(Insect insectState) {
		butterflyState = insectState;
	}
	
	
	public void move() {
		if(butterflyState instanceof Butterfly) {
			((Butterfly) butterflyState).fly();
		} else if (butterflyState instanceof Caterpillar) {
			((Caterpillar) butterflyState).walk();
		} else {
			System.out.println("Sorry. I am too young to move :(");
		}
	}
}
