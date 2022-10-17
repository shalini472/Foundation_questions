package foundationquestions001;

import java.util.Arrays;
import java.util.Scanner;

public class LargestInteger {

	public static String largestInteger() {
		return null;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the elements of number of elements of array:");
		  int length=sc.nextInt();
		  System.out.println("Enter the elements of array");
		  int[] sumArray=new int[length];
		  for(int i=0;i<length;i++){
			 sumArray[i]=sc.nextInt();
			 System.out.println(sumArray[i]);
		  }
		  int sum=0;
		  String str="";
		  String str1="";
		  int[] arrayOne=new int[sumArray.length];
		  for(int i=0;i<sumArray.length;i++) {
			sum=0;
			String str2=Integer(sumArray[i]).toString();
			for(int j=0;j<str2.toCharArray().length;j++) {
				 str1+=str2.toCharArray()[j];
				sum+=Integer.parseInt(str1);	
				str1="";
			}
			arrayOne[i]=sum;
		  }
		  int[] arrayTwo=new int[arrayOne.length];
		   Arrays.sort(arrayOne);
		  for(int k=arrayOne.length-1;k>=0;k--) {
				 str+=Integer(sumArray[k]).toString();
		  }
		  System.out.println(str);
		// TODO Auto-generated method stub

	}

	private static Object Integer(int i) {
		// TODO Auto-generated method stub
	   return i;
	}

}
