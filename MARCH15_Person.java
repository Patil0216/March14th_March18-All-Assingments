package Java.Fundamentals;

public class MARCH15_Person {
	
	   // fields
	   private String name;
	   private String email;
	   private String phoneNumber;

	   // constructor
	   public MARCH15_Person(String theName)
	   {
	      this.name = theName;
	   }
	   public MARCH15_Person(String theName ,String email)
	   {
	      this.name = theName;
	      this.name=email;
	   }
	   public MARCH15_Person(String theName ,String email,String phoneNumber)
	   {
	      this.name ="Sana";
	      this.email=email;
	      this.phoneNumber=phoneNumber;
	     
	   }
	   // methods - getters
	   public String getName() { return this.name;}
	   public String getEmail() { return this.email;}
	   public String getPhoneNumber() { return this.phoneNumber;}

	   // methods - setters
	   public void setName(String theName) { this.name = theName;}
	   public void setEmail(String theEmail) {this.email = theEmail;}
	   public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
	   public String toString()
	   {
	      return this.name + " " + this.email + " " + this.phoneNumber;
	   }

	   // main method for testing
	   public static void main(String[] args)
	   {
		   MARCH15_Person p1 = new MARCH15_Person("Sana","san123@gmail.com","202 998-6754");
	      System.out.println(p1);
	      MARCH15_Person p2 = new MARCH15_Person("Jean");
	      p2.setEmail("jean@gmail.com");
	      p2.setPhoneNumber("404 899-9955");
	      System.out.println(p2);
	   }
	}

	