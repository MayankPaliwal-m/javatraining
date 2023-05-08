import java.util.Scanner;
public class Mathr {
    public static void main(String[] args) {
	int value1 = 0;
	int value2 = 0;
	int operation = 0;

	Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value1 ");
        value1 = scanner.nextInt();
	
 	 System.out.println("Enter value2 ");
	 value2 = scanner.nextInt();

	 System.out.println("Enter 1 to add, 2 to subtract ");
	  operation = scanner.nextInt();
	 
	 if(operation == 1){
			int output = value1+value2;
			System.out.println(output);
			
			if(output%2 == 0){
				System.out.println("even output");
			}else{
				System.out.println("odd output");
			}
			
		}else if(operation == 2){
			System.out.println(value1-value2);
		}else{
			System.out.println("unsupported opreration !!");
		}
	  


  }
}	


//take 3 inputs from user, value1, value2, operation (add = 1, sub = 2, mul = 3, div = 4, mod = 5 )	
		// And perform operation on two values based on user input