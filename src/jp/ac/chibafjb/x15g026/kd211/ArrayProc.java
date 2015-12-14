package jp.ac.chibafjb.x15g026.kd211;

class ArrayProc {

	public static  int maxFind1( int num[], int a) {
		int m = 0;
		for(int i=0;i<a;i++){
			if(m<num[i]){
				m = num[i];
			}
		}
		return (m);

	}
	public static int maxFind2(int num[], int a){
		int m= 0;
		for(int i=1;i<a;i++){
			m = num[i];
		}
		return(m);
	}

}
