package demo;

public class inheri3 extends inheri2 {
public void override_One() {
	System.out.println("Manimaran Gopinathan");//normal implementation//
}
@Override
	public void override_Two() {
		System.out.println("Java Developer");//override implementation//
		super.override_Two();
	}
	public static void main(String[] args) {
		 inheri3 ride = new  inheri3();
            ride.override_Two();
            ride.override_One();
            
	}

}
