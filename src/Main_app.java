import java.util.Scanner;

public class Main_app {

	public static void main(String[] args) {

		int numOfQuestions = 10;
		int count = 0;
		int correctAnswers = 0;
		while (count < numOfQuestions) {

			int option = (int) (1 + Math.random() * 6);
			count++;

			switch (option) {
			case 1:
				if (addition())
					correctAnswers++;
				break;
			case 2:
				if (substraction())
					correctAnswers++;
				break;
			case 3:
				if (multiplication())
					correctAnswers++;
				break;
			case 4:
				if (division())
					correctAnswers++;
				break;
			case 5:
				if (squareRoot())
					correctAnswers++;
				break;
			case 6:
				if (pow())
					correctAnswers++;
				break;
			default:
				System.out.println("Nedefinisana opcija!");
				break;
			}

		}
		System.out.println("----------------------------");
		System.out.println("Broj tacnih odgovora: " + correctAnswers);
		System.out.println("Broj netacnih odgovora: " + (numOfQuestions - correctAnswers));

	}

	public static boolean addition() {

		int num1 = 1 + (int) (Math.random() * 10);
		int num2 = 1 + (int) (Math.random() * 10);

		int rez = num1 + num2;

		System.out.println("Unesite odgovor: " + num1 + " + " + num2);
		int user = (int) scanner();

		if (rez == user) {
			System.out.println("Odgovor tacan.");
			return true;

		}
		System.out.println("Odgovor netacan.\nTacan odgovor je " + rez);
		return false;

	}

	public static boolean substraction() {

		int num1 = 1 + (int) (Math.random() * 10);
		int num2 = 1 + (int) (Math.random() * 10);

		int rez = num1 - num2;

		System.out.println("Unesite odgovor: " + num1 + " - " + num2);
		int user = (int) scanner();

		if (rez == user) {
			System.out.println("Odgovor tacan.");
			return true;

		}
		System.out.println("Odgovor netacan.\nTacan odgovor je " + rez);
		return false;
	}

	public static boolean multiplication() {

		int num1 = 1 + (int) (Math.random() * 10);
		int num2 = 1 + (int) (Math.random() * 10);

		int rez = num1 * num2;

		System.out.println("Unesite odgovor: " + num1 + " * " + num2);
		int user = (int) scanner();

		if (rez == user) {
			System.out.println("Odgovor tacan.");
			return true;

		}
		System.out.println("Odgovor netacan.\nTacan odgovor je " + rez);
		return false;
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
			System.out.println("Odovor je netacan \nTacan odgovor je " + corectAnswer);

			return false;

		}

	}

	public static boolean squareRoot() {

		int num2 = (int) (Math.random() * 100) + 1;

		System.out.println("Koliko je korijen od " + num2);

		if (scanner() == Math.sqrt(num2)) {
			System.out.println("Odgovor je tacan ");
			return true;
		} else {
			System.out.println("Odgvor je netacan\nTacan odgovor je " + Math.sqrt(num2));
			return false;
		}
	}

	public static boolean pow() {
		int num2 = (int) (Math.random() * 10) + 1;
		Math.pow(num2, 2);
		System.out.println("Koliko je " + num2 + " na kvadrat");

		if (scanner() == Math.pow(num2, 2)) {
			System.out.println("Odgovor je tacan ");
			return true;
		} else {
			System.out.println("Odgovor je netacan\nTacan odgovor je " + Math.pow(num2, 2));
			return false;
		}

	}

	public static double scanner() {

		Scanner input = new Scanner(System.in);

		double answer = input.nextDouble();

		return answer;

	}

}
