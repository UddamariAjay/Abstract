package AbstractPackage;

public class Abstract2Interfase extends testAbstract{
	
	
	@Override
	public void sleep() {
		
		System.out.println("sleeping");
	}

	@Override
	void run() {
		
		System.out.println("running");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abstract2Interfase a = new Abstract2Interfase();
		a.sleep();
		a.run();
		a.bite();
		a.eat();
		
	}

	

}
