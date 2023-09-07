package xxx;

public class homework9_2 {
	
//	熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//	3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//	大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢已經入帳戶。假設媽媽一次匯款 2000 元,熊大一次提款
//	1000元,寫一個Java程式模擬匯款10次與提款10次的情形。


class Depot {
		private int stock = 0; // 餘額

		synchronized public void produce(int qty) {
			while (stock > 3000) {
				System.out.println("餘額在3000以上，暫停匯款");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			stock += qty;
			System.out.println("提款：" + qty + "；餘額：" + stock);
			notify();
		}

		synchronized public void consume(int qty) {
			while (stock < qty) {
				System.out.println("餘額在2000以下，停止提款");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			stock -= qty;
			System.out.println("提款：" + qty + "；餘額" + stock);
			if (stock < 2000) {
				System.out.println("餘額在2000以下，要求匯款");
				notify();
			}
		}
	}

	class Producer extends Thread {
		Depot depot;

		public Producer(Depot depot) {
			this.depot = depot;
		}

		public void run() {
			for (int i = 1; i <= 10; i++)
				depot.produce(2000); // 每次匯款2000
		}
	}
	
	
	class Consumer extends Thread {
		Depot depot;

		public Consumer(Depot depot) {
			this.depot = depot;
		}

		public void run() {
			for (int i = 1; i <= 10; i++)
				depot.consume(1000); // 每次消費1000
		}
	}

	public class TestWaitNotify {
		public static void main(String[] args) {
			Depot depot = new Depot();
			Producer producer = new Producer(depot);
			Consumer consumer = new Consumer(depot);
			producer.start();
			consumer.start();
		}
	}

	
	
}
