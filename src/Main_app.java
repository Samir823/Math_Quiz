import java.util.Scanner;

public class Main_app {

	public static void main(String[] args) {

		}

	public static boolean addition() {
		
		int num1 = (int) Math.random() * 10;
		int num2 = (int) Math.random() * 10;
		
		int rez = num1 + num2;
		int user = (int)scanner();
		
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
