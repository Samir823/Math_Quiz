import java.util.Scanner;

public class Main_app {

	public static void main(String[] args) {

<<<<<<< HEAD
		// TODO Auto-generated method stub
	}

	public static boolean addition() {
		double num1 = 1 + Math.random() * 10;
		double num2 = 1 + Math.random() * 10;
=======
	
		System.out.println(addition());
		}

	public static boolean addition() {
		
		int num1 = 1 + (int)(Math.random() * 10);
		int num2 = 1 + (int)(Math.random() * 10);
		
		int rez = num1 + num2;
		
		System.out.println("Unesite odgovor: " +num1+ " + " +num2);
		int user = (int)scanner();
		
		if(rez == user){
			System.out.println("Odgovor tacan.");
			return true;
			
		}
		System.out.println("Odgovor netacan.");
		return false;	
	
>>>>>>> 07fb2ef27ba4c591d40009654717a8ec5ceb84dd
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
