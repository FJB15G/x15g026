package jp.ac.chibafjb.x15g026.kd153;

import java.util.Scanner;

public class Kadai153 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("半径r --> ");
		float r = sin.nextFloat();
		sin.close();
		System.out.println("半径r --> "+(r));
		System.out.println("円周 = "+(Math.round(2*3.14*r*10)/10.0f));
		System.out.println("面積 = "+(Math.round(3.14*r*r*10)/10.0f));

	}

}
