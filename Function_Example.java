package Dec_1;

import java.util.Scanner;
public class Function_Example {
	
	static int i,j,size = 10;
	static int []a = new int[size];
	public static void main(String[] args) {
		Accept();
		Display();
		Greater();
		Smallest();
		Ascending();
		descending();
	}
	
	//Function for Accepting Array Elements
	public static void Accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How Many Numbers You Want : ");
		size = sc.nextInt();
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
