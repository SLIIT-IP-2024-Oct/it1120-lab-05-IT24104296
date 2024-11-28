import java.util.Scanner;
public class IT24104296Lab5Q3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
	int startdate,enddate,reserveddays;
	double total,roomcharge;
	roomcharge=48000.0;
	
	System.out.print("Enter Start date(1-31): ");
	startdate=input.nextInt();
	
	System.out.print("Enter end date(1-31): ");
	enddate=input.nextInt();
	
	reserveddays=enddate-startdate;
	
	if(startdate<1 || startdate>31 ||enddate<1 || enddate>31)
	{
		System.out.println("Error: Days must be between 1 and 31");
		return;
	}
	if (startdate>enddate)
	{
		System.out.println("Error: Start Date must be less than End date");
		return;
	}
	if(reserveddays>=5)
	{
		total=roomcharge*reserveddays*(80.0/100.0);
	}
	else if(reserveddays==4 || reserveddays==3)
	{
		total=roomcharge*reserveddays*(90.0/100.0);
	}
	else
	{
		total=roomcharge*reserveddays*(100.0/100.0);
	}

	System.out.println(" ");
	System.out.println("Room Charge Per Day: " +"Rs."+ roomcharge+"/=");
	
	System.out.println("Number of Days Reserved: " +reserveddays);
	
	System.out.println("Total amount to be paid: " +total);
	
	}
}