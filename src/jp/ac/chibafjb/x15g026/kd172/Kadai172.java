package jp.ac.chibafjb.x15g026.kd172;

public class Kadai172 {

	public static void main(String[] args) {
		int x[] = {1,2,3};
		int y[] = {7,8};
		int z[] = {0,0,0,0,0};
		int m = 3;
		int n = 2;
		for(int i=0;i<m;i++){
			z[i] = x[i];
		}
		
		for(int i=3;i<m+n;i++){
			z[i] = y[i-3];
		}
		
		System.out.print("z[] = {");
		for(int i=0;i<m+n-1;i++){
			System.out.print(z[i]+",");
		}
		System.out.print(z[m+n-1]+"}");
	}

}
