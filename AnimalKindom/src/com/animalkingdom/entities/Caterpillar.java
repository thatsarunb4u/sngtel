/**
 * 
 */
package com.animalkingdom.entities;

import com.animalkingdom.behavior.Walkable;

/**
 * @author Arun
 * A Caterpillar is an insect that can't fly. It can only crawl.
 *
 */
public class Caterpillar implements Insect,Walkable {

	@Override
	public void walk() {
		System.out.println("My walking is special. I am crawling!");
	}

}
