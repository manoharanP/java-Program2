import java.util.Scanner;
public class Positive
{
public static void main(String args[])
{
int Number;
Scanner num=new Scanner(System.in);
Number=num.nextInt();
if(Number>0)
System.out.println("The Number is Positive");
else if(Number<0)
System.out.println("The Number is Negative");
else
System.out.println("The Number Equals to 0");
}
}
