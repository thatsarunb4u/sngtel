/**
 * 
 */
package com.animalkingdom.solution;

import com.animalkingdom.entities.Language;
import com.animalkingdom.entities.Rooster;

/**
 * @author Arun
 *
 */
public class SolutionBonus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Bonus question 1. POC using Rooster
		Rooster rooster = new Rooster();
		System.out.println("I am a Rooster. I am gonna sing in my native Danish :P");
		rooster.singInNative(Language.Danish);//Caution: Danish is not my native. Haha.
				
	}

}
