package jp.ac.chibafjb.x15g026.kd222;

public class ArrayProc {

	public static double linerSearch1(double[] s, double n) {
		int b = 0;
        for(int i = 0; i < 100 && s[i] != n; i++) {
        	b++;
        }
		return b; 
    }

}
