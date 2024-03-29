package com.unimelb.swen30006.monopoly;

import java.util.Random;

/**
 * This class is created based on case study of Monopoly of "Applying UML and Patterns, 3rd edition by Craig Larman".
 * For demonstration on subject SWEN30006 at The University of Melbourne 
 * @author 	Yunzhe(Alvin) Jia
 * @version 1.0
 * @since 	2016-07-18
 *
 */
public class Die {
	public static final int MAX = 6;
	private int faceValue;
	private Random random = new Random(30006);
	public Die(){
		roll();
	}
	
	public void roll(){
		faceValue = random.nextInt(MAX) + 1;
	}
	
	public int getFaceValue() {
		return faceValue;
	}
}
