/**
 * 
 */
package com.animalkingdom.solution;

import com.animalkingdom.entities.Chicken;
import com.animalkingdom.entities.Duck;
import com.animalkingdom.entities.TypicalBird;

/**
 * @author Arun
 *
 */
public class SolutionAEvaluator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//A1
		TypicalBird bird = new TypicalBird();
		System.out.println("I am a typical bird");
		bird.walk();
		bird.fly();
		bird.sing();
		
		//A2
		Duck duck = new Duck();
		System.out.println("\nI am a Duck");
		duck.swim();
		duck.sing();
		Chicken chicken = new Chicken();
		System.out.println("\nI am a Chicken");
		chicken.sing();
		
	}

}
