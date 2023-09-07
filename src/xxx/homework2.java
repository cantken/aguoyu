package xxx;

public class homework2 {

//	請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)

	public static void main(String[] args)
	{
		int sum = 0;
		for (int count = 1; count <= 1000; count++)
			sum += count;
		System.out.println(sum);
	
//
////請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
	{
		int sum1 = 1;
		for (int count1 = 1; count1 <= 10; count1++)
			sum1 *= count1;
		System.out.println(sum1);

	}

//請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
	{
		 
			 int sum2 = 1,count2 =1;
		 while(count2 <= 10) {
			 sum2 *= count2;
			 count2 ++;
			 
		 }
		 System.out.println(sum2);

//請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100
	{
		int i, j;
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 10; j++)
				if (i == j)
					System.out.println(i * j);
		}
	}

//阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個		 
	{
		int i;
		for ( i = 0; i <= 49; i++) {
				if (i % 10 != 4 && i < 4*10)		
					System.out.println(i);
		}
	}

//請設計一隻Java程式，輸出結果為以下：		

	{
		char i, j;
		for (i = 'A'; i <= 'F' ; i++) {
			for (j = 'A'; j <= i; j++)   //AA BABB CACBCC DADBDCDD  
				System.out.print(i);
			System.out.println();
		}
	}

}
}
}