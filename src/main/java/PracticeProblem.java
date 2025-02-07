import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String notNum;
		notNum = in.nextLine();
		notNum = (5 + notNum);
		System.out.print(Integer.parseInt(notNum) + 5 +"\n");
		
		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String notDouble;
		notDouble = in.nextLine();
		notDouble = (4+notDouble+3);
		System.out.print(Double.parseDouble(notDouble) + 3.4 +"\n");
		
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String notBoolean;
		notBoolean = in.nextLine();
		System.out.println(!(Boolean.parseBoolean(notBoolean)));
		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String notChar;
		notChar = in.nextLine();
		notChar = (notChar + 3);
		int num;
		num = Integer.parseInt(notChar);
		num = num+2;
		System.out.print((char)num + "\n");


		
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String another;
		another = in.nextLine();
		another = (another+1);
		int numAgain;
		numAgain = (Integer.parseInt(another)/2);
		System.out.print(numAgain+0.0 +"\n");

		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String anotherOne;
		anotherOne = in.nextLine();
		anotherOne=  (1+ anotherOne);
		double numDoub;
		numDoub = (Double.parseDouble(anotherOne));
		System.out.print((int)(numDoub)+"\n");
		
	}

}
