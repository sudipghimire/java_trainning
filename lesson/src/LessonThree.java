/**
 * 
 */

/**
 * @author eton
 *Write a program using switch statement to develop a simple calculator for +, -, *, /, and % operators.
 */
import java.io.*;
public class LessonThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		int a, b, c, choice;
		//TODO: check for invalid numbers
		// FIXME: 
		System.out.println("Choose the number for calculation");
		System.out.println("1. Add ");
		System.out.println("2. Subtract ");
		System.out.println("3. Multipication ");
		System.out.println("4. Exit");
		System.out.println("Enter your choice ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		choice = Integer.parseInt(br.readLine());
		switch (choice) {
		case 1:
			System.out.println("enter first number");
			br = new BufferedReader(new InputStreamReader(System.in));
			a = Integer.parseInt(br.readLine());
			System.out.println("enter second number");
			br = new BufferedReader(new InputStreamReader(System.in));
			b = Integer.parseInt(br.readLine());
			c=a+b;
			System.out.println("The sum is "+" "+c);
			break;
		case 2 : System.out.println("enter first number");
		br = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(br.readLine());
		System.out.println("enter second number");
		br = new BufferedReader(new InputStreamReader(System.in));
		b = Integer.parseInt(br.readLine());
		c=a-b;
		System.out.println("The difference is "+" "+c);
		case 3 :
			System.out.println("enter first number");
			br = new BufferedReader(new InputStreamReader(System.in));
			a = Integer.parseInt(br.readLine());
			System.out.println("enter second number");
			br = new BufferedReader(new InputStreamReader(System.in));
			b = Integer.parseInt(br.readLine());
			c=a*b;
			System.out.println("The Multipication is "+" "+c);
		case 4:
			System.exit(0);
			default:
				System.out.println("invalid choice");
		}
		
		
	}

}
