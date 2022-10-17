package foundationquestions001;
import java.util.Arrays;
import java.util.Scanner;

public class Target {

	public static int[] target(int[] sumArray,int target) {
		  int[] answerArray=new int[2];
		  int k=0;
		  int j=0;
		      while(k<sumArray.length){
			  if((sumArray[0]+sumArray[sumArray.length-1-k])==target) {
				  answerArray[0]=sumArray[j];
				  answerArray[1]=sumArray[sumArray.length-1-k];
				  break;
			  }
			  else {
				  k++;
				  continue;
			  }
			  
		  }
		return answerArray;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 System.out.println("Enter the target:");
		  Scanner sc = new Scanner(System.in);
		  int target=sc.nextInt();
		  System.out.println("Enter the elements of number of elements of array:");
		  int length=sc.nextInt();
		  System.out.println("Enter the elements of array");
		  int[] sumArray=new int[length];
		  for(int i=0;i<length;i++){
			 sumArray[i]=sc.nextInt();
			 System.out.println(sumArray[i]);
		  }
		  int[] answerArray=Target.target(sumArray,target);
		  System.out.println(answerArray[0]);
		  System.out.println(answerArray[1]);
		 
		// TODO Auto-generated method stub

	}
	

}
