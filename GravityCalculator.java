// Program that computes the distance an object will fall in Earth's gravity
// Huynh Nguyen 1/28/2015

import java.util.*;
import java.lang.*;
import java.io.*;

class GravityCalculator {
    public static void main(String[] args) {
        double gravity = -9.81;	// Earth's gravity in m/s^2
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = .5 * (gravity * (fallingTime * fallingTime)) + 
			fallingTime * initialVelocity + initialPosition;
		System.out.println("The objects position after " + fallingTime + 
			" seconds is " + finalPosition + " m.");
	}
}
