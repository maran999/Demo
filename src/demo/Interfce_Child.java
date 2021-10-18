package demo;

public class Interfce_Child implements interfce{

	@Override
	public void inFace1() {
		System.out.println("interface one");
		
	}

	@Override
	public void inFace2() {
		System.out.println("interface two");
		
	}

	@Override
	public void inFace3() {
		System.out.println("interface three");
		
	}

	@Override
	public void inFace4() {
		System.out.println("interface four");
		
	}
	public static void main(String[] args) {
		Interfce_Child trl = new Interfce_Child();
		trl.inFace1();
		trl.inFace3();
		trl.inFace2();
	}

}
