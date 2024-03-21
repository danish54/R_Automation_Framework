package practise;

public interface InterfaceDefault {
	
	void method1();
	
	default void method2() {
		System.out.println("deafult");
	}
	
	
	static void method3() {
		System.out.println("static");
	}
	

}
