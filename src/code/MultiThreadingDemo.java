package code;

public class MultiThreadingDemo extends Thread {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("Main THread is executing line no. 5 ...");
		//We are creating a thread
		MultiThreadingDemo t1 = new MultiThreadingDemo();

		System.out.println("Main THread is executing line no. 9 ...");
		//We are starting the thread
		t1.start();
		System.out.println("Main THread is executing line no. 12 ...");
		System.out.println("Main THread is executing line no. 13 ...");
		System.out.println("Main THread is executing line no. 14 ...");
		System.out.println("Main THread is executing line no. 15 ...");
		System.out.println("Main THread is executing line no. 16 ...");
		System.out.println("Main THread is executing line no. 17 ...");
		System.out.println("Main THread is executing line no. 18 ...");
		System.out.println("Main THread is executing line no. 19 ...");
		System.out.println("Main THread is executing line no. 20 ...");
		System.out.println("Main THread is executing line no. 21 ...");
		System.out.println("Main THread is executing line no. 22 ...");
		System.out.println("Main THread is executing line no. 23 ...");
		System.out.println("Main THread is executing line no. 24 ...");
		System.out.println("Main THread is executing line no. 25 ...");
		System.out.println("Main THread is executing line no. 26 ...");
		System.out.println("Main THread is executing line no. 27 ...");
		System.out.println("Main THread is executing line no. 28 ...");
		System.out.println("Main THread will stope executing...");
		
	}

	
	// We are defining what the thread will do.
	public void run() {
		System.out.println("########################################## Start of Threading ##########################################");
		System.out.println("Multi THread is executing line no. 38 ...");
		
		while(true) {
			try {
				Thread.sleep(10000);
				System.out.println("thread is running...");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}