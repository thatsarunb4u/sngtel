/**
 * 
 */
package com.animalkingdom.util;

import com.animalkingdom.behavior.Flyable;
import com.animalkingdom.behavior.Singable;
import com.animalkingdom.behavior.Swimmable;
import com.animalkingdom.behavior.Walkable;
import com.animalkingdom.entities.Animal;

/**
 * @author Arun
 *
 */
public class AnimalCounter {
	public void countAnimals(Animal[] animals) {
		int flyCount = 0;
		int walkCount = 0;
		int singCount = 0;
		int swimCount = 0;
		
		for(Animal animal: animals) {

			//Reason for not using if-else is coz, there could be an animal that can fly, walk, sing etc.
			if(animal instanceof Flyable) {
				flyCount++;
			}
			if(animal instanceof Walkable) {
				walkCount++;
			}
			if(animal instanceof Singable) {
				singCount++;
			}
			if(animal instanceof Swimmable) {
				swimCount++;
			}
		}
		
		System.out.println("No. of animals that can fly:"+flyCount);
		System.out.println("No. of animals that can walk:"+walkCount);
		System.out.println("No. of animals that can sing:"+singCount);
		System.out.println("No. of animals that can swim:"+swimCount);
	}
}
