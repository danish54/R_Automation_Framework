package practise;

public class InterfaceImplimentation implements InterfaceDefault{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		InterfaceImplimentation obj = new InterfaceImplimentation();
		obj.method1();
		obj.method2();
		InterfaceDefault.method3();
		
	}

}
