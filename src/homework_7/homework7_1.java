package homework_7;


import java.io.*;

public class homework7_1 {
	public static void main(String[] args) {
		int i, count = 0, row = 0;
		String str;
		try {
			File f = new File("Sample.txt");
			FileReader fr1 = new FileReader(f);
			FileReader fr2 = new FileReader(f);
			BufferedReader br1 = new BufferedReader(fr1);
			BufferedReader br2 = new BufferedReader(fr2);

			System.out.println(f.length() + "個位元組");

			while ((i = br1.read()) != -1) {
				count++;
			}
			System.out.println(count + "個字元");

			while ((str = br2.readLine()) != null) {
				row++;
			}
			System.out.println(row + "列資料");

			br1.close();
			fr1.close();
			br2.close();
			fr2.close();
		} catch (IOException e) {
			System.out.println("錯誤");
		}
	}

}