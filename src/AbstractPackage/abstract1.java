package AbstractPackage;

public class abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        honda h = new honda();
        h.run();
        h.gear();
      
	}

}

abstract class bike {
	 
	bike(){
		System.out.println("bike");
	}
	
	abstract void run();
	
	void gear() {
		System.out.println("gear");
	}
	
}

class honda extends bike{

	@Override
	void run() {
		System.out.println("running");
		
	}
  	
}