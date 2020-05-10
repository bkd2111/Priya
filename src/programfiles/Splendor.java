// run time polymorphism//

package programfiles;

class Bike {
	public int price = 50000;
	void run()
	{
		System.out.println("Bike is Running");
	}
}

class Splendor extends Bike {
	//this method run is overriding Bike run method
	void run() {
		System.out.println("Splendor Running safely with 60km");
	}
}


class Yamaha extends Bike{
	public int yamahaPrice = 60000;
	public void runYamaha(){
		System.out.println("Running Yamaha");
	}
}

class Suzuki extends Bike{
	public int suzukiPrice = 60000;
	public void runSuzuki(){
		System.out.println("Running Suzuki");
	}
}

class Pulsar extends Bike{
	
}