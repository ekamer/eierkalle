import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int i=5;

		System.out.println("Gib Groesse");
		double gr = sc.nextInt();
		System.out.println("Gib Gewicht");
		int gew = sc.nextInt();

		double x = (gew / ((gr / 100) * (gr / 100)));

		System.out.println("Ihr BMI ist:" + x);

		if (x > 25)
			System.out.println("Sie sind uebergwewichtig!");

	}

}