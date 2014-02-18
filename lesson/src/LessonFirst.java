/**
 * 
 */

/**
 * @author eton
 * Write a program that computes your initials from your full name and displays them.
 *
 */
public class LessonFirst {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name;
		name="sudip Ghimire";
		name.substring(0, 4);
		System.out.println(name);
		
		
		StringBuilder stringBuilder= new StringBuilder("Sudip Ghimire");
		stringBuilder.subSequence(0, 4);
		System.out.println(stringBuilder);
		

	}

}
