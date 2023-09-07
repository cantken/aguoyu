package xxx;

import java.util.Arrays;

//利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，可以找出二維陣列的最大值並回傳，如圖

public class homework5_3 {
	public static void main(String[] args) {
		int intArray[][] = {{1, 6, 3}, {9, 5, 2}};
		double doubleArray[][] = {{ 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 }};
		System.out.println(maxElement(intArray));
//		System.out.println(maxElement(doubleArray));
	}
	public static int maxElement(int m [][]) {
		int max = 0 ;
		for (int i = 0; i < m.length ; i ++) {
			for(int j = 0; j <m[i].length ; j ++) {
				if (m [i][j] > max) {
					max = m [i][j];
			}
			}
		}
		return max;
	}

	public static double maxElement(double m [][]) {
		double max = 0 ;
		for (int i = 0; i < m.length ; i ++) {
			for(int j = 0; j <m[i].length ; j ++) {
				if (m [i][j] > max) {
					max = m [i][j];
				}
			}
		}
		return max;
	}
	
		
}	

