package jp.ac.chibafjb.x15g026.kd222;

import java.util.Scanner;

public class Kadai222 {

	public static void main(String[] args) {
		double score[] = new double[100];
		int a = 0;
		for(double i = 0;i<=49.5;i+=0.5)
		{
			score[a] = i;
			a++;
		}
		
		Scanner sin = new Scanner(System.in);
		double s_num = sin.nextDouble();
		sin.close();
		double b = ArrayProc.linerSearch1(score,s_num);
		if(b==100)
		System.out.format("探索値"+s_num+"は、配列score[]に存在しません。");
		else
		System.out.format("探索値"+s_num+"は、配列score["+b+"]に存在します。");
		

	}

}
