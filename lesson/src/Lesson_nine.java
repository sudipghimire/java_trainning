


import java.io.*;
public class Lesson_nine {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] places = new String[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the five place");
		places[0] = br.readLine();
		places[1] = br.readLine();
		places[2] = br.readLine();
		places[3] = br.readLine();
		places[4] = br.readLine();
		System.out.println("enter the word you want to search");
		String entered_place = br.readLine();
		System.out.println("the enterd place is " + entered_place);
		int count = -1;
		Boolean isFound=Boolean.FALSE;
		for (String e : places) {
			count++;
			   if (e.contains(entered_place)) {
				System.out.println("The place you entered is " + entered_place
						+ " ,it is used in :" + places[count]);
				isFound=Boolean.TRUE;
				//TODO i only want see true or false only.
			} if(!isFound) {
				System.out.println("the word you type is not in record"+e);
			}
		}
	}
			

}
