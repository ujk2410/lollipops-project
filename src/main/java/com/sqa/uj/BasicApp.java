/**
 * File Name: BasicApp.java<br>
 * Kaur, UJ<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 6, 2017
 */
package com.sqa.uj;

import java.util.*;

import com.sqa.uj.helpers.*;

/**
 * BasicApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Kaur, UJ
 * @version 1.0.0
 * @since 1.0
 */
public class BasicApp {

	static String appName = "Lollipops";

	static String user;

	static int numsofLollipops;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		user = AppBasics.welcomeUserAndGetName(appName);
		requestNumOfLollipops();
		AppBasics.farewellUser(appName, user);
	}

	/**
	 * 
	 */
	private static void requestNumOfLollipops() {
		String input;
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many numbers of Lollipops you would like " + user + "?");
		input = scanner.nextLine();
		numsofLollipops = Integer.parseInt(input.trim());
		System.out.println("Sounds like you would like " + (numsofLollipops - 3) + " number of lollipops!");
	}
}
