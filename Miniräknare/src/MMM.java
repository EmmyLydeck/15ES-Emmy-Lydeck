import java.util.Scanner;
public class MMM{

	public static void main(String[] args) {
		int counter = 0;
		while (counter <10) {
			System.out.println (counter);
			counter++;
		}
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt ();
		String op = sc.next () ;
		int y = sc.nextInt () ;

		int result = 0;
 	switch (op) {	
 	case "+":
 		
 		result = x + y;
 		break;
 	case "-":
 		
 		result = x - y;
 		break;
 	case "/":
 		
 	result = x / y;
 	break;
 		
 	}
 	
 	
	System.out.println(result);	
	sc.close ();
	}
}