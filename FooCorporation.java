// This program uses a payCalculator method to calculate pay.  Handles overtime and illegal work hours or pay.

import java.util.*;
import java.lang.*;
import java.io.*;

class FooCorporation {
	public static void main(String[] args) {
		//this is main and will call the payCalculator method
		payCalculator(7.5, 35);
		payCalculator(8.2, 47);
		payCalculator(10.0, 73);
		payCalculator(0,0);
		payCalculator(-5.0, 27);
		payCalculator(15.0, 40);
		payCalculator(20.0, 45);
	}
	
	// This method takes in hours worked and base pay to calculate total pay
	public static void payCalculator(double basePay, double hours) {
		double totalPay = 0.0;
		if ((basePay < 8.0) || (hours > 60)) {
			System.out.println("basePay too low or hours too high");
		} else {
			totalPay = Math.max(hours, 40) * basePay;
			if (hours > 40){
				totalPay = totalPay + ((hours % 40) * (basePay * 1.5));
			}
			System.out.println("Total Pay: " + totalPay);
		}
		
	}
}
