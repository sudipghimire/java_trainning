

/**
 * 
 */

/**
 * @author eton
 *
 */
public class AboutStringss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String length
		String name="Hi I am Sudip";
		int len=name.length();
		System.out.println("Hi I am Sudip length is "+" "+len);
		System.out.println("string length finish");
		
		// int compareTo(object or string and another string.
		//Q What is lexicographically ?(it show the number according to ASCII Value. 
		System.out.println("compare to String Start");
		String startString="Hi";
		String firstString="Sudip";
		String secondString="Ghimire";
		String thirdString="Sudip";
		
		int name1=firstString.compareTo(secondString);
		if(firstString.compareTo(secondString)==0){
			System.out.println("Strings are equal");
		}else{
			System.out.println("Strings are not equals");
		}
		System.out.println(name1);
		name1=firstString.compareTo(thirdString);
		System.out.println(name1);
		name1=secondString.compareTo(startString);
		System.out.println(name1);
		System.out.println("Finished of .CompareTo");
		
		//boolean equals(Object)
		System.out.println("boolean equals start");
		boolean check;
		check=firstString.equals(thirdString);
		System.out.println("boolean return value is"+" "+check);
		check=startString.equals(secondString);
		System.out.println("boolean return value is "+" "+check);
		System.out.println("boolean equals program is finished");
		
		//static Integer decode(String s) [decode string to Integer obj]
		//Q How to use 
		String number="100";
		Integer a = Integer.decode(number);
		System.out.println("Decode Integer: "+a);
		
		
		//static int parseInt(String s)[static is Integer]
		//Q how to use
		System.out.println("String to primitive type convert is start");
		String num="200";
		int b=Integer.parseInt(num);
		System.out.println("primitive type of string value is "+b);
		System.out.println("String to primitive type convert is end");
		
	
		
		//static int parseInt(String s, int radix)[static is Integer]
		//Q how to use
		System.out.println("Int PaserInt(String s. int radix) start");
		String num1="FF";
		int c=Integer.parseInt(num1, 16);
		System.out.println("the value of 50 with radix 10 is :"+c);
		System.out.println("Int PaserInt(String s. int radix) stop");
		//String toString()
		System.out.println("String toString is Start");
		String string=new String("hi i am sudip ghimire");
		System.out.println(string.toString());
		System.out.println("finished String tostring");
		
		//static Integer valueOf(int i)
		System.out.println("Integer value of is Start");
		int num2=10;
		Integer num3=Integer.valueOf(num2);
		System.out.println("primitive to object of num2 is "+num3);
		System.out.println("Integer value of is Finished");
		
				
		
		//static Integer valueOf(String s)
		System.out.println("Integer value of String to object is Start");
		String name5="100";
		Integer name4=Integer.valueOf(name5);
		System.out.println("String value in object Integer is "+name4);
		System.out.println("Integer value of String to object is end");
		
		//TODO not clear in radix
		//static Integer valueOf(String s, int radix)
		//Q how to use
		
		
		//- String substring(int beginIndex, int endIndex)
		//int name3=Integer.parseInt("hari khadka");
		System.out.println("Substring is start");
		String str=new String("using substring in java");
		System.out.println("substring with beginIndex and, endIndex start");
		System.out.println(str.substring(6));
		System.out.println(str.substring(0, 15));
		System.out.println("Substring is end");
		
		//String[] split(String regex) 
		////Q how to use
		System.out.println("using split");
		//StringTokenizer
		String[] splitString=str.split(" ",2);
		for(String splitValue: splitString){
			System.out.println(splitValue);
		}
		
		//String[] split(String regex, int limit)
		//Q how to use
		
		
		//String trim()
		System.out.println("trim Started");
		String n=new String("   using trim  ");
		System.out.println("with out trim");
		System.out.println(n);
		System.out.println("with trim");
		System.out.println(n.trim());
		System.out.println("trim finished");
		
		//String toLowerCase() 
		System.out.println("String toLowercase is Star");
		String text="COMPUTER";
		String text1=text.toLowerCase();
		System.out.println("The lower case of COMPUTER IS :"+text1);
		System.out.println("String toLowercase is end");
		
		//String toUpperCase()
		System.out.println("String toUpperCase is Start");
		String txt="computer";
		String txt1=txt.toUpperCase();
		System.out.println("The upper case of txt is :"+txt1);
		System.out.println("String toUpperCase is end");
		
		//Program output is not correct
		//int indexOf(int ch) [To find how many charater are there if of character than return -1]
		System.out.println("index of string is start");
		String name8="he is a good boy in this class";
		System.out.println("There is  "+name8.indexOf('o')+" o in the sentence");
		System.out.println("index of string is end");
		
		//int lastIndexOf(int ch, int fromIndex)
		System.out.println("lastIndex of string is start");
		System.out.println("The last index of i name8 string is "+name8.lastIndexOf('i', 13));
		System.out.println("lastIndex of string is end");
		
		//boolean contains(CharSequence s)
		System.out.println("the Charsequence is start");
		String[] names={"bhaktapur","bhuvan"};
		for(String name10:names){
			if(name10.contains("bhu")){
				System.out.println("the Charsequence of bhu is :"+ name10);
				
			}else if(name10.contains("kta")){
				System.out.println("The CharSequence of kta is :"+ name10);
			}
		System.out.println("the Charsequence is end");
		
		}
		
		//boolean endsWith(String suffix)[compare with suffix and return value]
		System.out.println("boolean endsWith is start");
		str="sudip ghimire";
		boolean check1;
		check1=str.endsWith("ghimire");
		System.out.println("the value of check is "+check1);
		check1=str.endsWith("sudip");
		System.out.println("the value of check is "+check1);
		System.out.println("boolean endsWith is end");
		
		//boolean startsWith(String prefix)
		System.out.println("boolean startWith is start");
		str="sudip ghimire";
		boolean check2;
		check2=str.endsWith("sudip");
		System.out.println("the value of check is "+check2);
		check2=str.endsWith("ghimire");
		System.out.println("the value of check is "+check2);
		System.out.println("boolean startWith is end");
		
		//int compareToIgnoreCase(String str)
		System.out.println("CompareToIgnoreCase is start");
		String str1="sudip";
		String str2="ghimire";
		String str3="sudip";
		int num7=str1.compareToIgnoreCase(str2);
		System.out.println("Compare to str1 and str2 value is"+num7);
		int num8=str1.compareToIgnoreCase(str3);
		System.out.println("Compare to str1 and str3 value is"+num8);
		int num9=str2.compareToIgnoreCase(str3);
		System.out.println("Compare to str3 and str2 value is"+num9);
		System.out.println("CompareToIgnoreCase is end");
		
		//TODO
		//boolean equals(Object anObject)
		//Case sensitive (Ram and raM) is not equal
		//1. Get Names, and ages of employes of company from user input.
		//2. Try #1 with multidimensional array
		//3. If you cannot work with #2 then you can maintain 2 separate array to hold names and ages
		//4. Ask user to search by age (using for reach loop)
		//5. Result should show the no. of count, theier names, and corresponding ages
		
		
		//boolean equalsIgnoreCase(String anotherString)
		//Case insensitive( RAm and raM) are equals
		
		// Contains Example
		// 1. Get no. of nouns from user input and store it in string array
		// 2. Ask user to search nouns in #1 with character sequence(by using contains OR equalIngnoreCase)
		// 3. Show no of occurrences in the result by #2
		// 4. Show noun and its from index and endindex of that char sequence
		// #2: kta
		// #4: Noun: Bhaktapur	Index: 3 to 5
		
		

	}
	
	/**
	 * //TODO
		//boolean equals(Object anObject)
		//Case sensitive (Ram and raM) is not equal
		//1. Get Names, and ages of employes of company from user input.
		//2. Try #1 with multidimensional array
		//3. If you cannot work with #2 then you can maintain 2 separate array to hold names and ages
		//4. Ask user to search by age (using for reach loop)
		//5. Result should show the no. of count, theier names, and corresponding ages
	 * @param names
	 * @param ages
	 * @author Sudip
	 */
	public void getNamesByUserName(String[] names, Integer[] ages){
		
	}

}
