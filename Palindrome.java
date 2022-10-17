package foundationquestions001;
import java.util.Scanner;

public class Palindrome {

	public static boolean checkPalindrome(String str) {
		  char[] characters=str.toCharArray();
		  String str2="";
		  for(int i=characters.length-1;i>=0;i--) {
			  str2+=characters[i];
		  }
		  if(str2==str) {
			  return true;
		  }
		  else {
			  return false;
		  }
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  String str=sc.nextLine();
		  Boolean check=Palindrome.checkPalindrome(str);
		  System.out.println(check);
		// TODO Auto-generated method stub

	}

}
