package jp.ac.chibafjb.x15g026.kd211;

import java.util.Scanner;

public class Kadai211 {

	public static void main(String[] args) {
		int num[] = {10,20,60,30,45,100};
		Scanner sin = new Scanner(System.in);
		Integer a = sin.nextInt();
		sin.close();
		int max = ArrayProc.maxFind1(num, a);
		System.out.format("配列num[]の最大値は、%dです。",max);

	}

}

