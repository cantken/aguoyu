package xxx;

import java.util.Iterator;
import java.util.Scanner;

public class homework4 {

//  1.有個一維陣列如下：
//	  {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	  請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	  (提示：陣列，length屬性)

	public static void main(String[] args) {
//		int avg;
//		// 宣告陣列
//		int[] num = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
//		// 宣告變數 總和sum
//		int sum = 0;
//		// 迴圈加總
//		for (int i = 0; i < num.length; i++) {
//			sum += num[i];
//		}
//		// 設定平均值
//		avg = sum / num.length;
//		// 列印平均值
//		System.out.println(avg);
//		// 迴圈求參數大於平均值
//		for (int j = 0; j < num.length; j++) {
//			if (num[j] > avg) {
//				System.out.println(num[j] + " ");
//			}
//		}
//
////	2.請建立一個字串，經過程式執行後，輸入結果是反過來的
////	  例如String s = “Hello World”，執行結果即為dlroW olleH
////	  (提示：String方法，陣列)
//		{
//
//			String s = "Hello World";
//			for (int i = 11; i > 0; i--)
//				System.out.println(s.substring(11 - 1, 11));
//		}
////	3.有個字串陣列如下 (八大行星)：
////	  {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
////	  請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
////	  (提示：字元比對，String方法
//
//	{
//		// 宣告陣列物件
//		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
//		// 宣告母音物件
//
//		// 做迴圈比對(比對索引)加入布判斷
//
//		int count = 0;
//		
//		//設定陣列的迴圈
//		for (int i = 0; i < planets.length; i++) {
//		//取出陣列裡的數值
//			String planet = planets[i];
//			// mercury
//			for (int j = 0; j < planet.length(); j++) {
//				char ch = planet.charAt(j);
//				// m
//				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//					count++;
//				}
//			}
//		}
//		
//		System.out.printf("total vowels: %d\n", count);
//	}
//
////	4.阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
////	  表如下：
////	  請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
////	  有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
////	  員工編號: 25 19 27 共 3 人!」
////	  (提示：Scanner，二維陣列)
//	
//	{
//		
//		//宣告鍵盤物件
//		Scanner sc = new Scanner(System.in);
//		int i = 0;
//		if(sc.hasNextInt()) {
//			i = sc.nextInt();
//		}System.out.println("請輸入:");
//		//宣告陣列二微陣列
		int[][] emps = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
//	
//		/**
//		 * [
//		 * [25, 32, 8, 19, 27],  // 0
//		 * [2500, 800, 500, 1000, 1200],  // 1
//		 * ]
//		 */
//		//宣告陣列長度
//		int len = emps[1].length;
//		//宣告總和變數
//		int count = 0;
//		//宣告陣列存放員工編號的變數
//		int[] target = new int[len];
//		// [25, 19, 27, 0, 0]  迴圈要搜尋陣列[1]裡面的數值
//		for(int m = 0; m < len; m ++) {
//		//[2500, 800, 500, 1000, 1200] 宣告[1][0]各別陣列裡的元素
//			int money = emps[1][m];
//			int empno = emps[0][m];
//		//設立迴圈顯示出陣列裡符合條件的元素
//			if(i <= money) {
//				target[count] = empno;
//				count++;
//			}
//		}
//		System.out.printf("有錢可借的員工編號:");
//		for (int n = 0; n < count; n++) {
//			System.out.print(target[n] + " ");
//		}
//		System.out.printf("共 %d 人!", count);
//	}
//
////	5.請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
////	  例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
////	  (提示1：Scanner，兩個陣列(平年、閏年列出來)) [31,28,.....][31,29,.....]if..else..
////   	  (提示2：需將閏年條件加入)
////	  (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
//	
		{
			// 宣告按鈕物件
			Scanner sc = new Scanner(System.in);
			int i = 0; // year
			int j = 0; // month
			int k = 0; // day

			System.out.println("請輸入:");
			// 年
			if (sc.hasNextInt()) {
				i = sc.nextInt();
			}
			// 月
			if (sc.hasNextInt()) {
				j = sc.nextInt();
			}
			// 日
			if (sc.hasNextInt()) {
				k = sc.nextInt();
			}

			// 宣告月份陣列
			// 宣告年份的陣列

			int[] m = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31 };
			int[] n = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			
			int month = 0;
			int count = 0;

			// 2000,3,10
			if (i % 400 == 0 || i % 100 == 0 || i % 4 == 0) {
				System.out.println("為閏年");

				for (int o = 0; o < j - 1; o++) {
					int num = n[o];
					count = count += num;

				}
			} else {
				System.out.println("不為閏年");
				for (int o = 0; o < j - 1; o++) {
					int num = m[o];
					count = count += num;
				}
			}
			System.out.println(count+k);
			
		}

	}

//	 6.班上有8位同學，他們進行了6次考試結果如下：
//	   請算出每位同學考最高分的次數
//	   (提示：二維陣列)

	{
		// 宣告test陣列
		int[][] test = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		// 求各陣列裡最高值

		// 設立迴圈做詢
		int[] maxcount = new int[8];
		for (int i = 0; i < test.length; i++) {
			int maxtime = -1;
			for (int j = 0; j < test[i].length; j++) {
				if (test[i][j] > maxtime) {
					maxtime = test[i][j];
				}
			}
			for (int j = 0; j < test[i].length; j++) {
				if (test[i][j] == maxtime) {
					maxcount[j]++;
				}
			}
		}
		for (int i = 0; i < maxcount.length; i++) {
			System.out.println();
			System.out.println(i + 1 + "號學生考最高的次數為: " + maxcount[i] + "次");

		}

	}
}
