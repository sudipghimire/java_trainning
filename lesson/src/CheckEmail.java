/**
 * 
 */

/**
 * @author eton
 *
 */
import java.io.*;
public class CheckEmail {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		String regularexpression="\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b";
		String email;
		System.out.println("enter email for check");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		email=br.readLine();
		if(email.matches(regularexpression)){
			System.out.println("email address is valid");
		}else{
			System.out.println("Invalid email");
		
		}
		
		

	}

}
