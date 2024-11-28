import java.util.Scanner;
public class IT24104296Lab5Q2 {
	public static void main(String[] args) {
		
//Declaring the variables
	int noofmembers;
	String prize;

//Creating new Scanner class		
	Scanner input=new Scanner(System.in);
	
//Getting user input for the n number of new members they introduce
	System.out.print("Enter the number of new members introduced :");
	noofmembers=input.nextInt();
	System.out.println("");
	
//Checking the prize

if (noofmembers==0)
{
	System.out.println("No Prize");
	return;
}
 
else if(noofmembers<0)
{
	System.out.println("Input must be number 0 or greater");
	return;
}

switch(noofmembers)
{
	
	case 1: prize="Pen";
	break;
	
	case 2: prize="Umbrella";
	break;
	
	case 3: prize="Bag";
	break;
	
	case 4: prize="Travelling chair";
	break;
	
	default: prize="Headphone";
	
}

System.out.println("Prize is a :"+prize);
	}
}