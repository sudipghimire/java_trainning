import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lessoneight {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */

	public static void main(String[] args) throws IOException {
		Lessoneight eight = new Lessoneight();
		String places[] = eight.constructFivePlaces();
		eight.searchPlacesByUserInput(places);		
	}

	public String[] constructFivePlaces() throws IOException {
		System.out.println("enter the name of five place");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String place = br.readLine();
		String[] places = place.split(" ");
		return places;
	}

	public void searchPlacesByUserInput(String[] places) throws IOException {
		System.out.println("which word  would you like to search");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String entered_place = br.readLine();
		System.out.println(entered_place);
		boolean isFound = Boolean.FALSE;
		for (String pl : places) {
			if(pl.contains(entered_place)){
				System.out.println("The " + entered_place + "is used in " + pl);
				isFound = Boolean.TRUE;
			}
		}
		if(!isFound)
		{
			System.out.println("the place is not in record: ");
		}
	}
}
