package xxx;

import java.util.Scanner;

//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//的號碼與總數,如圖:

public class homework3_3 {
	public static void main(String[] args) {

//設定一個可以存放50個數的陣列
		int[] lotto = new int[50];

		
		System.out.println("阿文...請問你討厭哪個數字");
		
//設定按鈕	

		Scanner sc = new Scanner(System.in);
		
			
			
//設定迴圈列出1~49
		
			int num = 0;
			
		int num1 = sc.nextInt();  //輸入的數字存到num
		if(0< num1 && num1 < 9)   //輸入數字的範圍
			for (int i = 1; i <= 49; i++) {  
				if(i % 10 != num1 && i / 10 != num1 ) {
				System.out.print(i);
				}
				
				
				
				if ( i % 6 == 0) {
					System.out.println();
				}
				
//設定去除條件			
				
				if (i % 10 != num1 && i < num1*10) {
					System.out.println();
				}
			}
			System.out.println();
		
		}
	}


