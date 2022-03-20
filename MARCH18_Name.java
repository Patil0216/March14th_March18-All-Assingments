package Polymorphism;
class Test1
{
    public static void talk()
    {
          System.out.print("hello ");
    }
    public static void talk(String name)
    {
          System.out.println("Mathew");
    }   
}

public class MARCH18_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1();
		t.talk();
		Test1 t1=new Test1();
		t1.talk("");
	}

}
