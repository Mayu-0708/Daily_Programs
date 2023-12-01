package Dec_1;

import java.util.Scanner;
public class Function_Example {
	
	static int i,j,size;
	static int []a ;
	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("--------- Operations---------");
		System.out.println("\n1.Greater Number\n2.Smallest Number\n3.Ascending Order\n4.Descending Order");
		System.out.print("Which Operation You Want to Perform On Any Random Array : ");
		ch = sc.nextInt();
		
		switch(ch)
		{
		 	case 1:
		 		Greater();
		 		break;
		 	case 2:
		 		Smallest();
		 		break;
		 	case 3:
		 		Ascending();
		 		break;
		 	case 4:
		 		descending();
		 		break;
		 	default:
		 		System.out.println("Enter Valid Choice ");
		 		
		}
	}
	
	//Function for Accepting Array Elements
	public static void Accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How Many Numbers You Want : ");
		size = sc.nextInt();
		a = new int[size];
		System.out.println("Enter Array Elements : ");
		for(i = 0; i < size; i++)
		{
			a[i] = sc.nextInt();
		}
	}
	
	//Function For Display Array Elements
	public static void Display()
	{
		System.out.println("Array Elements Are ");
		for(i = 0; i < size; i++)
		{
			System.out.print("\t"+a[i]);
		}
	}
	public static void Greater()
	{
		Accept();
		Display();
		int cal = a[0];
		for(i = 0; i < size; i++)
		{
			if(a[i] > cal)
				cal = a[i];
		}
	    System.out.println("\n\nGreatest Number is "+cal);
	}
	public static void Smallest()
	{
		Accept();
		Display();
		int cal = a[0];
		for(i = 0; i < size; i++)
		{
			if(a[i] < cal)
				cal = a[i];
		}
	    System.out.println("\n\nSmallest Number is "+cal);
	}
	
	public static void Ascending()
	{
		Accept();
		Display();
		int temp;
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nNumbers in ascending oredr: ");
		for(i=0;i<size;i++)
			System.out.print("\t"+a[i]);
		System.out.println();
	}
	
	public static void descending()
	{
		Accept();
		Display();
		int temp;
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nNumbers in descending oredr: ");
		for(i=0;i<size;i++)
			System.out.print("\t"+a[i]);
		System.out.println();
	}
}
