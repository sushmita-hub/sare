package Pratice1;

public class Class2 {
       
	
	String name;
	int age;
	public void Student() {
		System.out.println("Student name is:-");
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	public static void main(String[] args) {
		Class2 s1 =new Class2();
		s1.age=22;
		s1.name="Sushmita";
		s1.Student();
		
	}

}
