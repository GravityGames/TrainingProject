package scopesfun;

public class Box {
	
	// static scope: available to the whole class
	static int staticNum = 10;
	
	// instance scope: the variable/method is attached to a particular instance
	int instanceNum = 100;
	
	// method scope: all variables created or instanced in a method.
	// they do not leave the method
	
	public void method() {
		int methodNum = 5;
		
		if(true) {
			int someBlockNum = 9;
		}
	}
	
	
}
