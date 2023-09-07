package xxx;

import java.util.Scanner;

public class homework3_2 {
	public static void main(String[] args) {
		
		//宣告變數
		int i = 1;
		int z = 0;

		//陣列表現出1個數值輸入
		int[] triangle = new int [i];
		
		//設定按鈕鍵盤輸入
		
		Scanner sc = new Scanner(System.in);		
		if(sc.hasNextInt()) {
		
		//設定亂數

			i = sc.nextInt();
			i = (int)(Math.random()*10);
			if( i == 1 ) {
				System.out.println("答對了!答案就是1");
			}else { System.out.println("猜錯嘍");
			}
			}
		}

	}
	  
