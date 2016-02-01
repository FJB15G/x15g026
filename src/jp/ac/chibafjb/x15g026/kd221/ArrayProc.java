package jp.ac.chibafjb.x15g026.kd221;

public class ArrayProc {

	public static int linerSearch1(int[] s, int n) {
		int a = 0;
        for(int i = 0; i < 100 && s[i] != n; i++) {
        	a++;
        }
		return a; 
    }
	public static int linerSearch2(int[] s, int n) {
		int a = 99;
        for(int i = 99; i >= 0 && s[i] != n; i--) {
        	a--;
        }
        if(a==-1)
		return 100;
        return a;
    }

}
