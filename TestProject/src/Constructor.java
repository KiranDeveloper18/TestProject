class Demo  //class one
{
	int num;
	String Name;
	static String name;
	static int Rollnumber;
	static int Id;
	
	//constructor 1
	Demo ()
	{
		System.out.println("Constructor called : ");
	}
	
	//constructor 2 with parameterised 
	Demo (String name , int id , int rollnumber)    
	{
		
		this.name = name;
	    Id = id ;
		Rollnumber = rollnumber;
		
	}
}	
class Demo1    //class two 
{
	String name;
	int age;
	long id;
    
	Demo1 ()
	{
		System.out.println("Family details to enroll in covid - 19 tests");
	}
    // constructor 
	Demo1(String name) 
	{
		System.out.println("Family name : " + name);
	}
	
	//constructor with string and integer
	Demo1(String Name, int age)
	{
		System.out.println("Main of the family and age of the member : " + Name + " & " + age );
	}
	
	//constructor with long 
	Demo1(long id)
	{
		System.out.println("aadhar number of the member : " + id);
	}
}


public class Constructor 
{

	public static void main(String[] args) 
	{
		 Demo obj  = new Demo();   // with this object only we can call print statement of constructor1
		 Demo obj1 = new Demo("kiran" , 3248 , 45 );

		 //default name and number of constructor
		 
         System.out.println("default constructor name : " + obj.Name); 
         System.out.println("default constructor number : " + obj.num); 
         
         // parameterized user declared values 
         
         System.out.println();
 		 System.out.println("Below are the student details : ");
 		 System.out.println("name of the student : " + Demo.name );
         System.out.println("Id number : " + Demo.Id);
         System.out.println("rollnumber : " + Demo.Rollnumber);
         System.out.println();
         
         Demo1 obj2 = new Demo1();
         Demo1 obj3 = new Demo1("Orsu");
	     Demo1 obj4 = new Demo1("Narendra",52);
	     Demo1 obj5 = new Demo1(1239789367);
         
	}

}
