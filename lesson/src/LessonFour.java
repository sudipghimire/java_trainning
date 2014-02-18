/**
 * 
 */

/**
 * @author eton
 *4.	Write a program to find the number of and sum of all 
		integers greater than 100 and less than 200
		that are divisible by 7
 */
public class LessonFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		int sum=0,i;
		for(i=100;i<=200;i++)
		{
			if(i%7==0)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
