package jp.ac.chibafjb.x15g026.kd152;

import java.util.Scanner;

public class Kadai152 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("半径r --> ");
		float r = sin.nextFloat();
		sin.close();
		System.out.println("半径r --> "+(r));
		System.out.println("円周 = "+(2*3.14*r));
		System.out.println("面積 = "+(3.14*r*r));
		

	}

}
