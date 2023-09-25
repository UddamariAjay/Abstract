package AbstractPackage;

interface testInterfase {

	public void sleep();
	
	
	default void bite() {
		System.out.println("biting");
	}

}
