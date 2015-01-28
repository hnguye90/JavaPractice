// This program uses a loop to figure out the fastest and second fastest runners in the marathon

import java.util.*;
import java.lang.*;
import java.io.*;

class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }
        int index = fastestTime(times);
        System.out.println(names[index] + " is the fastest with " + times[index] + " min runtime");
        int secondIndex = secondFastestTime(times);
        System.out.println(names[secondIndex] + " is the second fastest with " + times[secondIndex] + " min runtime");
    }
    
    public static int fastestTime(int[] times) {
    	int index = 0;
    	for (int i = 0; i < times.length; i++) {
    		if (times[i] < times[index]) {
    			index = i;
    		}
    	}
    	return index;
    }
    
    public static int secondFastestTime(int[] times) {
    	int fastest = fastestTime(times);
    	int index = 0;
    	for (int i = 0; i < times.length; i++) {
    		//if (i == fastest){   // This was a different way to solve the solution without the i != fastest
    		//	i++;
    		//}
    		if (times[i] < times[index] && i != fastest) {
    			index = i;
    		}
    	}
    	return index;
    }
} 
