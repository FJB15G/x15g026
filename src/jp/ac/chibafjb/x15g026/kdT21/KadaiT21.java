package jp.ac.chibafjb.x15g026.kdT21;

import java.util.Scanner;

public class KadaiT21 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("ハンバーガーの個数   --> ");
		int a = sin.nextInt();
		System.out.print("フライドポテトの個数 --> ");
		int b = sin.nextInt();
		int c = 100*a;
		System.out.println("ハンバーガーの代金   = "+c+"円");
		int d = 180*b;
		System.out.println("フライドポテトの代金 = "+d+"円");
		int e = c+d;
		System.out.println("小計                 = "+e+"円");
		System.out.println();
		double f = (Math.floor(e * 0.08f));
		System.out.println("消費税               = "+(int)f+"円");
		double g = (e + f);
		System.out.println("合計金額             = "+(int)g+"円");
		System.out.println("");
		System.out.print("受取金額             --> ");
		int h = sin.nextInt();
		sin.close();
		double i = (h - g);
		System.out.print("つり銭               = "+(int)i+"円");
		

	}

}
