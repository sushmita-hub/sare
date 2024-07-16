package Pratice1;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
	Scanner scanner= new Scanner (System.in);
	
	System.out.println("Enter the name:-  Age  salary ");
	   String name= scanner.nextLine();
	   int Age= scanner.nextInt();
	   int salary =scanner.nextInt();
		System.out.println("name Age  salary  " +name+" "  +Age+" "  +salary );
	   
	}

}
