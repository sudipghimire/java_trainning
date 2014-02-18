/**
 * 
 */

/**
 * @author eton
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class LessonSeven {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		System.out.println("enter the name of Five place you visit");
		Scanner scanner=new Scanner(System.in);
		String []array_place=new String[5];
		for(String place:array_place){
			place=scanner.next();
			//System.out.println("the place you entered are	:"+place);
			
			
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("entered the place for details ");
		String entered_place=br.readLine();
		//System.out.println("the entered place is  :"+entered_place);
		if(entered_place.contains(place))
			

	}

}
