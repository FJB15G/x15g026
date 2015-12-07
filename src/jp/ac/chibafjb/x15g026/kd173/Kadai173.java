package jp.ac.chibafjb.x15g026.kd173;

import java.util.Scanner;

public class Kadai173 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		int[] data = new int[4];
		for(int i=0;i<data.length;i++){
			data[i] = sin.nextInt();
		}
		sin.close();
		int k = 3;
		data[k] = data[k-1];
		data[k-1] = data[k-2];
		data[k-2] = data[k-3];
		for(int i=0;i<=k;i++){
			System.out.println("data["+i+"] = "+data[i]);
		}

	}

}
