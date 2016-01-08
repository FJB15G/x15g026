package jp.ac.chibafjb.x15g026.kd221;

public class ArrayProc {

	public static int linerSearch1(int[] s, int n) {
		int a = 0;
        for(int i = 0; i < 100 && s[i] != n; i++) {
        	a++;
        }
		return a; 
    }

}
