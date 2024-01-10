package Srings;


import java.util.*;
public class String_InbuiltMethods
{
	String str;
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String_InbuiltMethods obj = new String_InbuiltMethods();
		obj.User();
	}
	public void User()
	{
		int choice;
		char answer;
		do
		{
			System.out.println("********* String Methods *********");
			System.out.println("\n1.Find length\n2.Concatination\n3.Change To Uppercase\n4.Change To Lowercase\n"+
			"5.Check Starts With \n6.Check Ends With\n7.Compare with Another String\n8.Replace Character\n"+
			"9.Check Equality of Two Strings\n10.Substring of given String\n11.Find Character At\n"+
			"12.Check Empty or not\n13.Check Substring or not\n14.Get Hash Code\n15.Copy Character into CharArray"+
			"\n16.Get Canonical Form\n");
			System.out.println("\nEnter Your Choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					String_Length();
					break;
					
				case 2:
					Concatination();
					break;
					
				case 3:
					Uppercase();
					break;
					
                case 4:
					Lowercase();
					break;
					
                case 5:
					StartsWith();
					break;
					
                case 6:
					EndsWith();
					break;
					
                case 7:
					comparison();
					break;
				
                case 8:
                	replaceCharacter();
                	break;
                	
                case 9:
                	CheckEquality();
                	break;
                
                case 10:
                	PrintSubstring();
                	break;
                	
                case 11:
                	CharacterAt();
                	break;
                	
                case 12:
                	CheckEmpty();
                	break;
                	
                case 13:
                	CheckSubstring();
                	break;
                	
                case 14:
                	getHashCode();
                	break;
                	
                case 15:
                	getChar();
                	break;
                	
                case 16:
                	canonicalForm();
                	break;
                
				default:
					System.out.println("Please Enter Valid Choice.....");
					break;
			}
			
			System.out.println("\nDo You Want to perform Any Other Operation (yes/no) : ");
			answer = sc.next().charAt(0);
		}while(answer == 'y' || answer == 'Y');
		
	}
	
	public void accept()
	{
		System.out.println("Enter The String : ");
		sc.nextLine();
		str = sc.nextLine();
	}
	public void String_Length()
	{
		accept();
		int length;
		length = str.length();
		System.out.println("Length of Given String : "+length);
	}

	public void Concatination()
	{
		accept();
		String str2,str3;
		System.out.println("Enter String which you want to cancat with given String : ");
		str2 = sc.nextLine();
		str3 = str.concat(str2);
		System.out.println("String After Concatination : "+str3);
	}
	
	public void Uppercase()
	{
		accept();
		String str1;
		str1 = str.toUpperCase();
		System.out.println("String in Uppercase : "+str1);
	}

	public void Lowercase()
	{
		accept();
		String str1;
		str1 = str.toLowerCase();
		System.out.println("String in LowerCase : "+str1);
	}
	
	public void StartsWith()
	{
		accept();
		String Start;
		System.out.println("Enter the String Which you want to check Given String Start with or not : ");
		Start = sc.nextLine();
		boolean check =  str.startsWith(Start);
		if (check == true)
		{
			System.out.println("Given String Starts With "+Start);
		}
		else
			System.out.println("Given String is not Starts With "+Start);
		
	}
	
	public void EndsWith()
	{
		accept();
		String end;
		System.out.println("Enter the String Which you want to check Given String end with or not : ");
		end = sc.nextLine();
		boolean check =  str.endsWith(end);
		if (check == true)
		{
			System.out.println("Given String Ends With "+end);
		}
		else
			System.out.println("Given String is not Ends With "+end);
	}
	
	public void comparison()
	{
		accept();
		String str1;
		System.out.println("Enter Next String for Comparison : ");
		str1 = sc.nextLine();	
		int check = str.compareTo(str1);
		if(check == 1)
		{
			System.out.println(str+" is Same as "+str1);
		}
		else
		{
			System.out.println(str+" is not Same as "+str1);
		}
	}
	
	public void replaceCharacter()
	{
		accept();
		char char1,char2;
		String replacedString;
	    System.out.print("Enter the character to replace: ");
	    char1 = sc.next().charAt(0);
	    
        System.out.print("Enter the replacement character: ");
        char2 = sc.next().charAt(0);
        
        replacedString = str.replace(char1, char2);
        System.out.println("Original String: " + str);
        System.out.println("Replaced String: " + replacedString);
	}
	
	public void CheckEquality()
	{
		accept();
		String str1;
		System.out.print("Enter the string To check Equality : ");
        str1 = sc.nextLine();
        boolean check = str.equals(str1);
        if (check == true)
        {
            System.out.println("The strings are equal.");
        } else
        {
            System.out.println("The strings are not equal.");
        }
	}
	
	public void PrintSubstring()
	{
		accept();
		int start, end;
		String subString;
		System.out.print("Enter the starting index for the substring: ");
        start = sc.nextInt();
        System.out.print("Enter the ending index for the substring: ");
        end = sc.nextInt();
        
        if (start >= 0 && end <= str.length() && start <= end)
        {
            subString = str.substring(start, end);
            System.out.println("Substring: " + subString);
        } 
        else
        {
            System.out.println("Invalid  index for substring. Please check your input.");
        }
	}
	
	public void CharacterAt()
	{
		accept();
		char Character;
		int index;
		System.out.print("Enter an index to retrieve the character: ");
        index = sc.nextInt();
        if (index >= 0 && index < str.length()) 
        {
            Character = str.charAt(index);
            System.out.println("Character at index " + index + ": " + Character);
        } 
        else
        {
            System.out.println("Invalid index. Please enter a valid index within the string length.");
        }
	}
	
	public void CheckEmpty()
	{
		accept();
		boolean check = str.isEmpty();
		if (check == true)
		{
            System.out.println("The string is empty.");
        }
		else
		{
            System.out.println("The string is not empty.");
        }
	}
	
	public void CheckSubstring()
	{
		accept();
		String Substring;
		System.out.print("Enter the substring to check: ");
        Substring = sc.nextLine();
        boolean check = str.contains(Substring);
        if (check == true) 
        {
            System.out.println("The given string contains the  substring "+Substring);
        }
        else
        {
            System.out.println("The given string does not contain the substring "+Substring);
        }
	}
	public void getHashCode()
	{
		accept();
		int hashCode;
		
		hashCode = str.hashCode();
        System.out.println("Hash code of the given string : " + hashCode);
	}
	
	public void getChar()
	{
		accept();
		char[] charArray = new char[str.length()];
        str.getChars(0, str.length(), charArray, 0);
        System.out.print("Characters in the string : ");
        for (char c : charArray) 
        {
            System.out.print(c + " ");
        }
	}
	
	public void canonicalForm()
	{
		String str1;
		accept();
		str1 = str.intern();
        System.out.println("Original String: " + str);
        System.out.println("Interned String: " + str1);

	}
}









