/**
 * 
 */
package com.animalkingdom.entities;

import com.animalkingdom.behavior.Singable;

/**
 * @author Arun
 *
 */
public class Parrot implements Bird, Singable {

	
	Singable singableAnimal;
	
	/* 
	 * This method makes the parrot sings exactly like its neighbour. Magic!
	 */
	@Override
	public void sing() {
		this.singableAnimal.sing();

	}
	
	public void setNeighbour(Singable singableAnimal) {
		this.singableAnimal = singableAnimal;
	}

}
