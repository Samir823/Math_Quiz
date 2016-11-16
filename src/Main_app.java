import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Main_app {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
	}

	public static boolean addition() {
		double num1 = Math.random() * 10;
		double num2 = Math.random() * 10;
		
		double rez = num1 + num2;
		double user = scanner();
		
		if(rez == user){
			return true;
		}

		return false;	
	
	}

	public static void substraction() {

	}

	public static void multiplication() {

	}

	public static boolean division(double odgovor) {
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);

		return true;

	}

	public static void squareRoot(double a) {
	}

	public static void pow(double a) {

	}

	public static double scanner() {

		Scanner input = new Scanner(System.in);

		double answer = input.nextDouble();

		return answer;

	}

}
