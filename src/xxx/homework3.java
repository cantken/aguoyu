package xxx;

import java.util.Scanner;

public class homework3 {
//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形,如圖示結果:

	public static void main(String[] args) {
		//宣告變數
		int i=0,j=0,k=0;
		
		//陣列表現出3個數值輸入
		int[][][] triangle = new int [i][j][k];
		
		//鍵盤輸入
		Scanner sc = new Scanner(System.in);		
		if(sc.hasNextInt()) {
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();
		}System.out.println("請輸入:");
		
		
		//正三角形判定
		if( i==j && j==k) { 
			System.out.println("正三角形");
			}
		//等腰三角形判定
		else if( i==j || j==k || j == k) {
			System.out.println("等腰三角形");
			}
		//其他三角形判定
		else if( i !=j && j !=k && j != k) {
			System.out.println("其他三角形");
			}
		//不是三角形判定
		else if(i == 0 || j == 0 || k == 0) {
			System.out.println("不是三角形");
		    }
		
		else {System.out.println("輸入錯誤");}
					
	


}

}
