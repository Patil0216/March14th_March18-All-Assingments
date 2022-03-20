package Inheritance;



	 class Dog1
	 {
	     public void speak()
	     {
	         System.out.println("woof!");
	     }
	 }
	    


	 class Beagle extends Dog1
	 {
	     public void speak()
	     {
	         System.out.println("arf arf");
	     }
	 }


	 public class MARCH17_MODIFY_INHERITANCE_CODE  {
	 	 public static void main(String[] args)
	 	    {
	 	        Dog1 d = new Dog1();
	 	        d.speak();
	 	        Dog1 b = new Beagle();
	 	        b.speak();
	 	    }


	 }


