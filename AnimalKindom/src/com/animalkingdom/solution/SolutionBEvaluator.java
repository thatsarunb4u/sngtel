/**
 * 
 */
package com.animalkingdom.solution;

import com.animalkingdom.entities.Cat;
import com.animalkingdom.entities.Chicken;
import com.animalkingdom.entities.Dog;
import com.animalkingdom.entities.Duck;
import com.animalkingdom.entities.Parrot;
import com.animalkingdom.entities.Phone;
import com.animalkingdom.entities.Rooster;
import com.animalkingdom.entities.TypicalBird;

/**
 * @author Arun
 *
 */
public class SolutionBEvaluator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//A1
		System.out.println("Solution A1!");
		TypicalBird bird = new TypicalBird();
		System.out.println("I am a typical bird");
		bird.walk();
		bird.fly();
		bird.sing();
		
		//A2
		System.out.println("\n\nSolution A2!");
		Duck duck = new Duck();
		System.out.println("\nI am a Duck");
		duck.swim();
		duck.sing();
		Chicken chicken = new Chicken();
		System.out.println("\nI am a Chicken");
		chicken.sing();

		//A3
		System.out.println("\n\nSolution A3!");
		Rooster rooster = new Rooster();
		System.out.println("\nI am a Rooster. I am a sibling of Chicken");
		rooster.sing();
		
		
		//A4
		System.out.println("\n\nSolution A4!");
		Parrot dogParrot = new Parrot();
		System.out.println("\nHello. I am a Parrot living near Dog");
		dogParrot.setNeighbour(new Dog());
		dogParrot.sing();
		
		Parrot catParrot = new Parrot();
		System.out.println("\nHello. I am a Parrot living near Cat");
		catParrot.setNeighbour(new Cat());
		catParrot.sing();
		
		Parrot roosterParrot = new Parrot();
		System.out.println("\nHello. I am a Parrot living near Rooster");
		roosterParrot.setNeighbour(new Rooster());
		roosterParrot.sing();
		
		//Bonus what ifs
		Parrot duckParrot = new Parrot();
		System.out.println("\nHello. I am a Parrot living near Duck");
		duckParrot.setNeighbour(new Duck());
		duckParrot.sing();
		
		Parrot phoneParrot = new Parrot();
		System.out.println("\nHello. I am a Parrot living near Phone");
		phoneParrot.setNeighbour(new Phone());
		phoneParrot.sing();
		
	}

}
