package demo;

public class inheri {
   public void fOne() {
System.out.println("First Gen");
}
   public void f1_new() {
	System.out.println("New F1 gen");
}
	public static void main(String[] args) {
		 inheri crt = new  inheri();
         crt.fOne();
         crt.f1_new();
	}

}
