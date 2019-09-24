package scopesfun;

public class Playground {
	
	public static void main(String[] args) {
		System.out.println(Box.staticNum);
		
		Box box1 = new Box();
		box1.staticNum = 11;
		box1.instanceNum = 200;
		System.out.println(box1.staticNum);
		System.out.println("Box 1 instanceNum: " + box1.instanceNum);
		
		Box box2 = new Box();
		
		System.out.println(box2.staticNum);
		System.out.println("Box 2 instanceNum: " + box2.instanceNum);
	}
	
}
