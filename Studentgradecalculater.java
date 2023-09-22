import java.util.Scanner;

public class StudentGradeCalculator {
	public static void main(String[] args)
	{
		System.out.println("Enter Total Number of Subjects");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int totalmarks=0;
	    
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter Total marks got out of 100 in Subject "+i);
			int marks=s.nextInt();
			if(marks<=100 && marks>=0)
			     totalmarks+=marks;
				
		}
		int avgpercentage=(totalmarks/n);
		
		if(avgpercentage>85)
		{
			System.out.println("Toltal marks = "+totalmarks);
			System.out.println("Average Percentage = "+avgpercentage+"%");
			System.out.println("Grade = A+");	
		}
		else if(avgpercentage>70)
		{
			System.out.println("Toltal marks = "+totalmarks);
			System.out.println("Average Percentage = "+avgpercentage+"%");
			System.out.println("Grade = A");	
		}
		else if(avgpercentage>55)
		{
			System.out.println("Toltal marks = "+totalmarks);
			System.out.println("Average Percentage = "+avgpercentage+"%");
			System.out.println("Grade = B+");	
		}
		else if(avgpercentage>40)
		{
			System.out.println("Toltal marks = "+totalmarks);
			System.out.println("Average Percentage = "+avgpercentage+"%");
			System.out.println("Grade = B");	
		}
		else if(avgpercentage>=30)
		{
			System.out.println("Toltal marks = "+totalmarks);
			System.out.println("Average Percentage = "+avgpercentage+"%");
			System.out.println("Grade = C");	
		}
		else
		{
			System.out.println("Toltal marks = "+totalmarks);
			System.out.println("Average Percentage = "+avgpercentage+"%");
			System.out.println("Grade = D");	
		}
	}

}