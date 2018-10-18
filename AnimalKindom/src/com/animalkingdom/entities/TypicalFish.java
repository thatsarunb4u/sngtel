/**
 * 
 */
package com.animalkingdom.entities;

import com.animalkingdom.behavior.TypicalSwimmer;

/**
 * @author Arun
 * A typical fish can Swim. But can't sing or walk. So sad.
 */
public class TypicalFish extends TypicalSwimmer implements Fish {
	
	private String size;
	private String color;

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
