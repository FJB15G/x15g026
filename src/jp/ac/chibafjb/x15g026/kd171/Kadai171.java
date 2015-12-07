package jp.ac.chibafjb.x15g026.kd171;

public class Kadai171 {

	public static void main(String[] args) {
		int[] data = {100,200,300,0};
		int k = 3;
		data[k] = data[k-1];
		data[k-1] = data[k-2];
		data[k-2] = data[k-3];
		for(int i=0;i<=k;i++){
			System.out.println("data["+i+"] = "+data[i]);
		}

	}

}
