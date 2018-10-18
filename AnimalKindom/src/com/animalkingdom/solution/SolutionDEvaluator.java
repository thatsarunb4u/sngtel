/**
 * 
 */
package com.animalkingdom.solution;

import com.animalkingdom.entities.Butterfly;
import com.animalkingdom.entities.ButterflyLifecycle;
import com.animalkingdom.entities.Caterpillar;

/**
 * @author Arun
 * 
 */
public class SolutionDEvaluator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//D1
		System.out.println("Solution D1:");
		Butterfly butterfly = new Butterfly();
		System.out.println("Introduction: I am a butterfly. I can't make a sound");
		butterfly.fly();
		
		System.out.println("\n\nSolution D2:");
		
		Caterpillar caterpillar = new Caterpillar();
		System.out.println("\nIntroduction: I am a Caterpillar. I can't fly.");
		
		ButterflyLifecycle butterflyLifeCycle = new ButterflyLifecycle();
		System.out.println("\n\nButterfly lifecycle of the butterfly begins.");
		//Butterfly lifecycle begins.
		//The butterfly is now a caterpillar
		System.out.println("The butterfly is now a caterpillar");
		butterflyLifeCycle.morph(caterpillar);
		butterflyLifeCycle.move();
		
		//Now the metamorphosis takes place and caterpillar becomes a butterfly
		System.out.println("Now the metamorphosis takes place and caterpillar becomes a butterfly");
		butterflyLifeCycle.morph(butterfly);
		butterflyLifeCycle.move();		
		
	}

}
