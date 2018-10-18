/**
 * 
 */
package com.animalkingdom.entities;

/**
 * @author Arun
 * A ClownFish is a fish, and a typical swimmer that can make jokes. haha. 
 */
public class ClownFish extends TypicalFish{
	public ClownFish(){
		setSize("Small");
		setColor("Colorful(Orange)");
	}
	
	void makeJoke() {
		System.out.println("J+O+K+E = Joke! Hahaha");
	}

	@Override
	public String toString() {
		return "ClownFish [Size=" + getSize() + ", Color=" + getColor() + "]";
	}

	
}
