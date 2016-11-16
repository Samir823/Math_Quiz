import java.util.Scanner;

public class Main_app {

	public static void main(String[] args) {


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
	
	}

	public static boolean substraction() {
		
		int num1 = 1 + (int)(Math.random() * 10);
		int num2 = 1 + (int)(Math.random() * 10);
		
		int rez = num1 - num2;
		
		System.out.println("Unesite odgovor: " +num1+ " - " +num2);
		int user = (int)scanner();
		
		if(rez == user){
			System.out.println("Odgovor tacan.");
			return true;
			
		}
		System.out.println("Odgovor netacan.");
		return false;	
	}

	public static void multiplication() {

	}

	public static boolean division() {
		int num1 = (int) (Math.random() * 10) + 10;
		int num2 = (int) (Math.random() * 10) + 1;

		double corectAnswer = num1 / num2;

		System.out.println("Unesite tacan odgovor: " + num1 + "/" + num2);

		if (scanner() == corectAnswer) {
			System.out.println("Odovor je tacan ");

			return true;
		} else {
			System.out.println("Odovor je netacan \nTacan odgovor je "
					+ corectAnswer);

			return false;

		}

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
