package homework_7;

import java.io.*;

public class homework7_3 {
	public static void copyFile(File f1, File f2) {
		try {
			FileInputStream fis = new FileInputStream(f1);
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(f2);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			int c;
			while ((c = bis.read()) != -1) { // 讀到檔案的尾端時,read()會回傳-1
				fos.write(c);
				fos.flush();
			}
			bos.close();
			fos.close();
			bis.close();
			fis.close();
			
		} catch (IOException e) {
			System.out.println("錯誤");
		}
	}

	public static void main(String[] args) {
		File f1 = new File("images.jpg");
		File f2 = new File("images4.jpg");
		copyFile(f1, f2);
	}
}