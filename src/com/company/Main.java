package com.company;

public class Main {

    public static void main(String[] args) {
	int earthMass = 105;
	double gForceEarth= 9.8;
	double massOnMoon;
	double clearWeight;
	double gForceMoon;

	clearWeight = earthMass / gForceEarth;
	gForceMoon = gForceEarth * 0.17;
	massOnMoon = gForceMoon * clearWeight;
	System.out.println("Your weight on Moon is equal to " + massOnMoon);
    }
}
