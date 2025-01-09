package P1;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
	Scanner sc=new Scanner(System.in);
	ArrayList <String>stu=new ArrayList<String>();
	void studentedit() {
		System.out.println("To add rollnumber enter    1");
		System.out.println("To read rollnumber enter   2");
		System.out.println("To update rollnumber enter 3");
		System.out.println("To delete rollnumber enter 4");
		System.out.println("To exit enter 5");
		int t;
		do {System.out.println("Enter the option[1,2,3,4,5] : ");
			
			t=sc.nextInt();
			sc.nextLine();
			
			if(t>0 && t<=5) {
			switch(t) {
			case 1:addstudent();break;
			case 2:readstudent();break;
			case 3:updatestudent();break;
			case 4:removestudent();break;
			case 5:break;
			default :System.out.println("Enter valid option");}
			}
			else {System.out.println("Enter valid option : ");}
			
		}while(t!=5);
		System.out.println("Program ended successfully");
	}

	void addstudent() {
		
		System.out.println("Enter the rollnumber to add ");
		
		String st=sc.nextLine();
		stu.add(st);
	    System.out.println("Rollnumber added successfully");
	}
	void updatestudent() {
		if(stu.isEmpty())
		{System.out.println("List is empty");}
		else {
		System.out.println("Enter the position of rollnuber to update");
		int p=sc.nextInt();
		sc.nextLine();
		if(p<stu.size())
		{
			System.out.println("Enter the updated rollnumber");
			String urn=sc.nextLine();
			stu.set(p,urn);
			System.out.println("Rollnumber updated successfully");
			System.out.println(stu);
		}
		else
		{System.out.println("Invalid position");}
		}}
	void readstudent() {
		if(stu.isEmpty())
		{System.out.println("List is empty");}
		else {
		System.out.print("Rollnumber in the list are : ");
		System.out.println(stu);}
	}
	void removestudent() {
		if(stu.isEmpty())
		{System.out.println("List is empty");}
		else {
		System.out.println("Enter the rollnumber to delete : ");
		String sr=sc.nextLine();
		if(stu.remove(sr))
		{
			System.out.println("Rollnumber removed successfully");
			System.out.println(stu);
		}
		else
		{System.out.println("Invalid Rollnumber");}
		}
		}
	}
		
public class Main {
	public static void main(String args[])
	{
		Student class1=new Student();
		class1.studentedit();
	}
}
