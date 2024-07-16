package Pratice1;

public class thissKeyword {
	int id;
	String sname;
	char grad;
	void n1( int sid,String name, char gr) {
		id=sid;
		sname=name;
		grad=gr;
	}
	
	public static void main(String[] args) {
		thissKeyword th=new thissKeyword();
		th.n1(123, "Sushimu", 'A');
	}

} 
