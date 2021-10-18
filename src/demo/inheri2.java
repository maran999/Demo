package demo;

public class inheri2 extends inheri {
private void f2_two() {
	System.out.println("F2 GEN");
}
public static void main(String[] args) {
	inheri2 crt2 = new inheri2();
	crt2.f2_two();
	crt2.fOne();
	crt2.fTwo("Mani",'G');
	crt2.fTwo(150000000.09f);
}
//overloading//
public void fTwo(String name,char fname) {
	System.out.println("The name of the person is"+ name+" "+fname);
}
public void fTwo(float salary) {
	System.out.println("Minimum salary is"+salary);
}
//overriding//
public void override_One() {
	System.out.println("Manimaran");
}
public void override_Two() {
	System.out.println("Developer");
}
}

