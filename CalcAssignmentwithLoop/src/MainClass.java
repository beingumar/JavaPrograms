import java.util.Scanner;

public class MainClass {
	public static void main(String [] args)  
	{
		Scanner sc= new Scanner(System.in);
		Maths m = new Maths();
		boolean flag = true;
		
		while(flag) 
		{
			System.out.println("Enter 1st number:");
			int a=sc.nextInt();
			System.out.println("Enter 2nd number:");
			int b= sc.nextInt();
			System.out.println("1.Add\n2.Subtract\n3.Mulitply\n4.Division\n5.Square\n6.Cube\n7.Exit\nEnter your option:");
			int choice = sc.nextInt();
			switch(choice) 
			{
				case 1:
			        m.add(a,b);
			        break;
			    case 2:
			        m.sub(a,b);
			        break;
			    case 3:
			    	m.mul(a, b);
			    	break;
			    case 4:
			    	if(a==0 || b==0) 
			    	{
			    		System.out.println("Not divisible by 0");
			    		break;
			    	}
			    	else{
			    		m.div(a, b);
				    	break;	
			    	}
			    case 5:
			    	m.square(a, b);
			    	break;
			    case 6:
			    	m.cube(a, b);
			    	break;
			    case 7: 
			    	flag=false;
			    	break;
			    default:
			        System.out.println("Invalid input");
			        break;
			}	
			
		}
		
	}
}
