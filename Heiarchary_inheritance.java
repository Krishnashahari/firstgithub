package Inheritance;

public class Heiarchary_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we will first see mother properties that will be no inheritance that will bve just calling out from another class 
				Mother m= new Mother();
				m.home();
				m.money();
				
				//now comes inheritance of son 
				Son s= new Son ();
				s.home();//mother properties have accquired 
				s.laptop();
				s.mobile();
				s.money();//mother properties have accquired 
			Son.responsibility();//static property just for test 
			
			daughter d= new daughter ();
			
			d.friends();
			d.home();
			d.looks();
			d.money();
//now here we can see that daughter acquires the property of mother with the help of heirachry 			
			}
			

		

	}

