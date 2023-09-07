package xxx;

public class homework9_1 {
//	開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//	競賽過程。
//	• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//	Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
//	• 參考範例：CounterRunnable.java
//	• 需留意主執行緒執行順序
	public static void main(String[] args) {
		System.out.println("-----大胃王快食比賽開始!-----");
		bigEater contestant1 = new bigEater("饅頭人","10");
		bigEater contestant2 = new bigEater("詹姆士","10");
		Thread man1 = new Thread (contestant1);
		Thread man2 = new Thread (contestant2);
		
		man1.start(); 
		man2.start();
		
//		try {
//			man1.join();
//			man2.join();
//		} catch (InterruptedException e) {
//			System.out.println("Main thread Interrupted");
//		}
		
		System.out.println("-----大胃王快食比賽結束!-----");

	}
}

class bigEater implements Runnable {
	int counter = 0;
	String name;
	Thread t;
	String threadname;// 執行緒名
	
	public bigEater(String name ,String threadname) {	
		this.name = name;//大胃王選手
		this.threadname = threadname;
		t = new Thread(this, this.threadname); // 建構元內即同時建構執行緒
//		
	}
	
	public void run() {
		while (counter < 10 ) {
			counter++;
			System.out.println(name + "吃第" + counter + "碗飯");
			if (counter == 10) {
				System.out.println(name + "已經吃完啦!");
			}
			
			
			
			try {
				Thread.sleep((int)(Math.random()*2501+500));
			} catch (Exception e) {
			}
		}
	}
}
 