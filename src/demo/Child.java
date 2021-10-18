package demo;

public class Child extends  Typ_Castin_Parent {
	
			@Override
			public void show() {
				System.out.println("child");
				super.show();
			}
			 
			public void showChild() {
				System.out.println("Tis is Unique method of Child");
			}
			public static void main(String[] args) {
				Typ_Castin_Parent ob1 = new Child();
				//Child ob2 =  (Child) new Typ_Castin_Parent();//===>doubt
				// Child ob2 = new 
				//ob1.show();
				ob1.na();
				ob1.show();
			
			}
		}

