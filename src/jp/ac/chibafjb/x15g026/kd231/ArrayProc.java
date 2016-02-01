package jp.ac.chibafjb.x15g026.kd231;

public class ArrayProc {

	public static int binarySearch1(int d[] ,int s) {
		int L = 0;
		int H = 4;
		int m = (L + H) / 2;
		for(;L <= H && d[m] != s;){
			if(d[m] < s){
				L = m + 1;
			}
				else{
				H = H - 1;
			}
		m = (L + H) / 2;
		}		
		if(L <= H){
		return m;
		}
		else{
		return -1;
		}

	}

}
