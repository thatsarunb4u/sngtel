package com.animalkingdom.entities;

import com.animalkingdom.behavior.Singable;

/**
 * @author Arun
 * A Chicken that is a Bird, that can sing and cannot fly 
 */
public class Chicken implements Bird, Singable {

	@Override
	public void sing() {
		System.out.println("Cluck,cluck");
	}

}
