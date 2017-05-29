package OddAndEvenNumbers;
import java.util.Scanner;
public class OddAndEvenNumbers{
	public static void main(String arg[]){
		Scanner input=new Scanner (System.in);
			int a;
		
		System.out.println("Please enter a number: ");
		a=input.nextInt();
		if(a%2==0){
			System.out.println("This number is an even number ");
		}
		else {
			System.out.println("This number is an odd number");
		}
	}

}
