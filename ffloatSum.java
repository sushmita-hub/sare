package Pratice1;

public class ffloatSum {

	public static void main(String[] args) {

		float[] marks= {12.2f,11.2f,22.7f,56.0f,25.1f};
		float sum=0;
           for(float numbers:marks) {
        	   sum=sum+ numbers;
           }
           System.out.println("the valuse of the sum is " +sum);
	}

}
