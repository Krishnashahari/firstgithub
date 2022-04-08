package Inheritance;

public class Multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we will see the multilevel inheritance 
		ML1 m1=new ML1();
		m1.condition();
		m1.check1();//as we can see we are calling the methods of ml1 non staatic methods 
		
		ML2 m2=new ML2();
		m2.check();
		m2.cond();
		m2.check1();// properties of ml1 shifted to ml2
		m2.condition();//properties of ml1 shifted to ml2
		
		
		ML3 m3=new ML3();
		m3.check();
		m3.check1();
		m3.cond();
		m3.condition();
		m3.look();
		m3.test3();
// as we can see above all the properties of ML1 and ML2 is shifted to ml3 from super class and supermost class and this so go on if we create the 4 th class
		// this is the multilevel inheritance 
		
	}
 
}
