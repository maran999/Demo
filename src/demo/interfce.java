package demo;

public interface interfce {
public void inFace1(); //only get requirement specification 
 void inFace2(); 	 // weather we declare public or not in interface it always treated as public-
 void inFace3();     //-/static
public void inFace4(); 
public static void inFace5() {
	System.out.println("trialrun");
}
/*public static void main(String[] args) {
	 interfce trl = new  interfce();// in interface also we cannot creat obj
}*/
}
