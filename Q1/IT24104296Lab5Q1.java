import java.util.Scanner;
public class IT24104296Lab5Q1 {
	public static void main(String[] args) {
	
//Defining the variables
	int num1,num2,num3,smallest,largest;
	
//Creating a new scanner class
	Scanner input=new Scanner(System.in);
	
//Getting the input from user
	System.out.print("Enter the first integer: ");
	num1=input.nextInt();
	
	System.out.print("Enter the second integer: ");
	num2=input.nextInt();
	
	System.out.print("Enter the third integer: ");
	num3=input.nextInt();
	
//Displaying the three integers
	System.out.println();
	System.out.println("User entered the numbers are : " +num1+ " " +num2+ " " +num3);
	
//check the numbers
	smallest=num1;
	largest=num1;
	
if (num2<smallest)
{smallest=num2;
}	

if (num2>largest)
{largest=num2;
}

if(num3<smallest)
{smallest=num3;
}

if (num3>largest)
{largest=num3;
}

System.out.println("The Smallest number is: "+smallest);
System.out.println("The Largest nember is: "+largest);

	}
}