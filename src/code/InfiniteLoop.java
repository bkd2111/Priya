package code;

public class InfiniteLoop {

	public static void main(String[] args) throws InterruptedException {
		while (true) {
			Thread.sleep(5000);
			System.out.println("Running while loop infintely...");
		}
	}

}
