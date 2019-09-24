package welcome;

public class HelloWorld {
	
	static int number = 100;
	static Car car;
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		change(number);
		System.out.println(number);
		
		car = new Car();
		car.model = "2015 Honda Pilot";
		
		destroy(car);
		
	}
	
	public static void change(int num) {
		num=20;
	}
	
	public static void destroy(Car c) {
		c=null;
		System.out.println(car);
	}

}
