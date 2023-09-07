package xxx;

import java.util.Scanner;

//請設計三個類別Calculator.java，CalException.java與CalTest.java，在Calculator.java裡有個自訂
//方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。 CalTest.java執行後，使用者可
//以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：

//1. x與y同時為0，(產生自訂的CalException例外物件)
//2. y為負值，而導致x的y次方結果不為整數
//3. x與y皆正確情況下，會顯示運算後結果


public class CalTest {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println("請輸x的值");
		if (sc.hasNextInt()) {
			x = sc.nextInt();
			cal.setx(x);
		}
		
		System.out.println("請輸y的值");
		if (sc.hasNextInt()) {
			y = sc.nextInt();
			cal.sety(y);
		}
		System.out.println(x + "的" + y +"次方=" + cal.powerXY());
	}
}
