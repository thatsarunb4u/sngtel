/**
 * 
 */
package com.animalkingdom.solution;

import com.animalkingdom.entities.Cat;
import com.animalkingdom.entities.Chicken;
import com.animalkingdom.entities.ClownFish;
import com.animalkingdom.entities.Dog;
import com.animalkingdom.entities.Dolphin;
import com.animalkingdom.entities.Duck;
import com.animalkingdom.entities.Parrot;
import com.animalkingdom.entities.Phone;
import com.animalkingdom.entities.Rooster;
import com.animalkingdom.entities.Shark;
import com.animalkingdom.entities.TypicalBird;
import com.animalkingdom.entities.TypicalFish;

/**
 * @author Arun
 *
 */
public class SolutionBEvaluator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//B1
		System.out.println("Solution B1:");
		TypicalFish typicalFish = new TypicalFish();
		System.out.println("\nI am a Fish. I can't sing or walk.");
		typicalFish.swim();
		
		//B2
		System.out.println("\n\nSolution B2:");
		Shark shark = new Shark();
		System.out.println("\nIam a Shark!");
		System.out.println("Size:"+shark.getSize()+"||Color:"+shark.getColor());
		shark.swim();
		
		
		ClownFish clownFish = new ClownFish();
		System.out.println("\nIam a ClownFish!");
		System.out.println("Size:"+clownFish.getSize()+"||Color:"+clownFish.getColor());
		clownFish.swim();
		
		//Shark eating clownfish
		System.out.println();
		shark.eat(clownFish);
		
		
		System.out.println("\n\nSolution B3:");
		Dolphin dolphin = new Dolphin();
		System.out.println("\nIam a Dolphin. I am not a fish. But I can still swim!");
		dolphin.swim();
		
		
	}

}
