/**
 * 
 */
package com.animalkingdom.solution;

import com.animalkingdom.entities.Animal;
import com.animalkingdom.entities.Butterfly;
import com.animalkingdom.entities.Cat;
import com.animalkingdom.entities.Caterpillar;
import com.animalkingdom.entities.Chicken;
import com.animalkingdom.entities.ClownFish;
import com.animalkingdom.entities.Dog;
import com.animalkingdom.entities.Dolphin;
import com.animalkingdom.entities.Duck;
import com.animalkingdom.entities.Parrot;
import com.animalkingdom.entities.Rooster;
import com.animalkingdom.entities.Shark;
import com.animalkingdom.entities.TypicalBird;
import com.animalkingdom.entities.TypicalFish;
import com.animalkingdom.util.AnimalCounter;

/**
 * @author Arun
 * 
 */
public class SolutionEEvaluator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//E
		System.out.println("Solution E:");
		//Output for the items given in the requirement
		Animal[] animals = new Animal[] {
				new TypicalBird(), //Replacement for Bird
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(), //There is no mention that Parrot can fly.
				new TypicalFish(),
				new Shark(),
				new ClownFish(),
				new Dolphin(),
				new Caterpillar(), //Replacement for Frog. There is no frog in requirements before.
				new Dog(), //There is no mention that dog can walk. Only mention of making sound.
				new Butterfly(),
				new Cat() //There is no mention that dog can walk. Only mention of making sound.
		};
		
		new AnimalCounter().countAnimals(animals);
	}

}
