package Inheritance;

public class Singlelevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IS1 t1=new IS1();//creating object for isi class 
		t1.add();//calling isi methods non static 
		IS1.test2();// calling static method from isi 
		
		//so in the concept of single inheritance we will see is2 will acquire the properties of is1 
		
		System.out.println("================");
		
		IS2 t2=new IS2();//creating object for is2 class 
		t2.sub();//calling is2 non static methods 
		t2.test();//
		t2.add();//calling is1 methods in is2 becox of inheritance concept is2 wil acquire the properties of is1 (non static method )
		IS2.test2();//(static methods )
		
		
	}

}
