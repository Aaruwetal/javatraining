import java.util.*;

 class Main
{
static int replace(int number)
{
// Base case for recursion termination
if (number == 0)
return 0;
// Extract the last digit and change it if needed
int digit = number % 10;
if (digit == 0)
digit = 1;
// Convert remaining digits and append the last digit
return replace(number/10) * 10 + digit;
}
static int Convert(int number)
{
if (number == 0)
	return 1;
else
	return replace(number);
} 

public static void main(String[] args) 
	{
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
 		number = sc.nextInt();
		System.out.print("nNumber after replacement : ");
		System.out.print(replace(number));
	}
}
