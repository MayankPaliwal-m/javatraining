import java.util.*;
public class Maths {
    public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);

         System.out.println("Enter a ");
         float a=sc.nextFloat();

 	 System.out.println("Enter b ");	
	 float b=sc.nextFloat();

	 float sum=a+b;
	 System.out.println("sum is "+sum);

	 float sub=a-b;
 	 System.out.println("Difference of a&b is "+sub);
	
	 float mult=a*b;
	 System.out.println("Product of a&b is "+mult);	

	 float div=a/b;
	 System.out.println("Division of a&b is "+div);
	 
	 float rem=a%b;
	 System.out.println("Remainder of a/b is "+rem);

	 System.out.println("Type any whole number to see how i changed value of 'a' that you provided");

	 int z = sc.nextInt();
	 	
         a+=b;
         System.out.println("a = "+a);

	 a/=b;
	 System.out.println("now a is "+a);
    }
}