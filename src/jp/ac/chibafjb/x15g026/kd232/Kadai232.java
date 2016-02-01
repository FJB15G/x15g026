package jp.ac.chibafjb.x15g026.kd232;

import java.util.Scanner;

public class Kadai232 {

	public static void main(String[] args) {
		int data[] = {132,64,51,19,3};
		System.out.println("data[0] = "+data[0]);
		System.out.println("data[1] = "+data[1]);
		System.out.println("data[2] = "+data[2]);
		System.out.println("data[3] = "+data[3]);
		System.out.println("data[4] = "+data[4]);
		Scanner sin = new Scanner(System.in);
		System.out.print("探索する値を入力 --> ");
		int s_int = sin.nextInt();
		sin.close();
		int i = ArrayProc.binarySearch2(data, s_int);
		if(i==-1){
		System.out.println("探索値"+s_int+"は、配列data[]に存在しません。");
		}
		else{
		System.out.println("探索値"+s_int+"は、配列data["+i+"]に存在します。");
		}

	}

}
