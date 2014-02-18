/**
 * 
 */

/**
 * @author eton
 *
 */
import java.io.*;

public class LessonFive {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO how to input five name in one time and store using multi
	/*	
		String[] name = new String[3];
		Integer[] age = new Integer[3];
		String name1;
		System.out.println("enter the name of chief of finance");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		name[0] = br.readLine();
		System.out.println("Enter the age of chief of finance ");
		br = new BufferedReader(new InputStreamReader(System.in));
		age[0] = Integer.parseInt(br.readLine());
		System.out.println("enter the name of chief of admin");
		br = new BufferedReader(new InputStreamReader(System.in));
		name[1] = br.readLine();
		System.out.println("Enter the age of chief of admin ");
		br = new BufferedReader(new InputStreamReader(System.in));
		age[1] = Integer.parseInt(br.readLine());
		System.out.println("enter the name of chief of marketing");
		br = new BufferedReader(new InputStreamReader(System.in));
		name[2] = br.readLine();
		System.out.println("Enter the age of chief of marketing ");
		br = new BufferedReader(new InputStreamReader(System.in));
		age[2] = Integer.parseInt(br.readLine());
		System.out.println("enter the name you want to search");
		name1 = br.readLine();
		int count = 0;
		int indexCount = -1;
		String name22 = null;
		for(String nam: name){
			indexCount++;
			if(nam.equals(name1)){
				System.out.println("Search Name: "+name[indexCount] + " age: "+age[indexCount]);
				count++;
			}
		name22=nam;
		
		}
		System.out.println("Count of employee found: "+count);
		System.out.println("The value name1"+name22);
		*/
		StringBuffer a= new StringBuffer("123321");
		System.out.println(a.reverse());
		StringBuffer rev=a.reverse();
		if(a.equals(rev)){
			System.out.println("palindrome");
		}else{
			System.out.println("not palindrome");
		
		}
		
		
	}

}
