package xxx;

public class homework1 {

	public static void main(String[] arge) {
// 計算12，6這兩個數值的和與積
	int num1 = 12, num2 = 6;
	System.out.println(num1+"與"+num2+"的和為"+(num1+num2));
	System.out.println(num1+"與"+num2+"的積為"+num1*num2);
	
// 計算200顆蛋共是幾打幾顆？ (一打為12顆)	
	int num3 = 200, num4 = 12;
	String a_1 = "打" ;
	String a_2 = "顆" ;
	System.out.println("200顆蛋共是"+(num3 / num4)+a_1+(num3 % num4)+a_2);

	//	請由程式算出256559秒為多少天、多少小時、多少分與多少秒	
	int second = 256559,s = 60,m = 60,h = 24;
	int num6 = (256559/s),num7 = (256559%s);
	int num8 = (num6/m),num9 = (num6%m);
	int num10 = (num8/h),num11 = (num8%h);
	
	
	System.out.println(second+"秒為"+(num10+"天")+(num11+"小時")+(num9+"分")+(num7+"秒"));
	
//  請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
	final double PI = 3.1415;
	int radius = 5;
	double circumference = PI*(radius*2) ;
	double area = PI*radius*radius;
	
	System.out.println("半徑"+radius+"的圓面積為"+area);
	System.out.println("半徑"+radius+"的圓周長為"+circumference);

//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢 (用複利計算，公式請自行google)	
	
	double PV = 1500000.0, i = 0.02;
	double FV = PV*Math.pow((1+i), 10);
	
	System.out.println("150萬10年後本金加利息為" + FV);
	
	
//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//	5 + 5
//	5 + ‘5’
//	5 + “5”
//	並請用註解各別說明答案的產生原	
	
	
	System.out.println("5+5="+(5+5)+"算式裡的數字都是被當作整數來運算");
	System.out.println("5+'5'="+(5+'5')+"這裡算式'5'是作為字元在ASCII對應十進位的數值為053所以5+53=58");
	System.out.println("5+\"5\"="+(5+"5")+"這裡的\"5\"則是被當作字串");
	
	
	}
	

}
