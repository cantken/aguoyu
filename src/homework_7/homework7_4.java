package homework_7;

import java.io.*;

public class homework7_4 {
	public static void main(String[] args)throws  Exception  {
		File data = new File("C:\\data");
		if(!data.exists())
			data.mkdir();
		Dog Jimmy1 = new Dog("Jimmy1");
		Dog Jimmy2 = new Dog("Jimmy2");
		Cat Joe1 = new Cat("Joe1");
		Cat Joe2 = new Cat("Joe2");
		File obj = new File("C:\\data\\Object.ser");
		FileOutputStream fos = new FileOutputStream(obj);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(Jimmy1);
		oos.writeObject(Jimmy2);
		oos.writeObject(Joe1);
		oos.writeObject(Joe2);;
		oos.close();
		fos.close();
	}

}