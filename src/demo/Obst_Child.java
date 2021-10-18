package demo;

public class Obst_Child extends Obst {

	
	public static void main(String[] args) {
		Obst tst = new Obst_Child();
             tst.test();
             tst.test1();
             
	}

	@Override
	public void test() {
		System.out.println("abstraction Completed Here");
		
	}

}
