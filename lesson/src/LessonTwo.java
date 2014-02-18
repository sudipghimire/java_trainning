import java.io.IOException;

public class LessonTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 6)
				break;
			// System.out.println("break is working");

		}
		// use of Continue.

		System.out.println("i am out side the loop");
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 5) {
				continue;

			} else {
				System.out.println("it works");
				break;
				
			}
		}
		
		// use of return
		// try in nested for
		
		

		}

}
