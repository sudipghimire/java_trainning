/**
 * 
 */

/**
 * @author eton
 * Write a program that computes your initials from your full name and displays them.
 *
 */
import java.io.*;

public class LessonOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		String name;
		name = "sudip Ghumire";
		name.substring(0, 4);
		System.out.println(name);

		StringBuffer stringBuilder = new StringBuffer("Sudip ghimire");
		stringBuilder.substring(0, 4);
		System.out.println(stringBuilder);
		String cvalue;
		do {
			System.out.println("enter your first name");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String fname, lname, cname;
			fname = br.readLine();
			System.out.println("enter your Last name");
			lname = br.readLine();
			System.out.println("your full name is " + fname + " " + lname);
			System.out.println("which name would you like to Separate");
			System.out.println("1. First name");
			System.out.println("2. Last name");
			br = new BufferedReader(new InputStreamReader(System.in));
			cname = br.readLine();
			if (cname.equals("1")) {
				System.out.println("you choose first name ");
			} else if (cname.equals("2")) {
				System.out.println("you choose last name ");
			} else {
				System.out.println("Invalid choice");
			}
			System.out
					.println("Do you want to try it again y for cont.. n for exit");
			BufferedReader ram = new BufferedReader(new InputStreamReader(
					System.in));
			cvalue = ram.readLine();
			// System.out.println(cvalue);
			// Q how to check the not equal in string.
			// Q Write an application that reads in a
			// five-digit integer and determines whether it is a palindrome.
			// If the number is not five digits long, display an error message
			// and allow the
			// user to enter a new value
		} while (!cvalue.equals("y"));

	}
}
