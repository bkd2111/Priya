package programfiles;

public class BikeShowroom {

	public static void main(String args[]) {
		Bike bike1 = new Splendor();// upcasting
		Bike bike2 = new Yamaha();
		Bike bike3 = new Suzuki();

		for

		//Static method called directly without creating Object
		runStaticMethodBikes(bike1);
		runStaticMethodBikes(bike2);
		runStaticMethodBikes(bike3);
		
		//Non Static method cannot be called directly without creating Object, 
		//So we have to create the object always to access the non static method
		BikeShowroom bikeShowroom = new BikeShowroom();
		bikeShowroom.runNonStaticMethodBikes();
		
		
		Yamaha bikeYamahaDowncasting = (Yamaha) bike2; // Downcasting
		bikeYamahaDowncasting.runYamaha();
		System.out.println(bikeYamahaDowncasting.yamahaPrice);
		System.out.println(bikeYamahaDowncasting);

		Splendor bikeSplendor = new Splendor();// upcasting
		Yamaha bikeYamaha = new Yamaha();
		Suzuki bikeSuzuki = new Suzuki();
		bikeYamaha.runYamaha();
		bikeSuzuki.runSuzuki();

	}
	//Static Method
	private static void runStaticMethodBikes(Bike bike) {
		bike.run();
	}

	//Non Static Method
	private void runNonStaticMethodBikes() {

	}

}
