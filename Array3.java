package Pratice1;
public class Array3 {
        
	int sid;
	String sname;
	char grad;
	void getvalues(int id, String name, char g)
	{
		sid=id;
		sname=name;
		grad=g;
	}
	
	void display() {
		System.out.println(sid+" "+sname+" " +grad );
	}
	
	
	public static void main(String[] args) {
		Array3 stud=new Array3();
		stud.getvalues(123, "Sushmita", 'A');
		stud.display();
	}
	
}