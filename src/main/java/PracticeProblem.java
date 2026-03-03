import java.util.Scanner;

public class PracticeProblem {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		scanner.close();
	}

	public static void q1() {
		System.out.print("Input a boolean: ");
        boolean b = scanner.nextBoolean();
        System.out.println(b);
	}

	public static void q2() {
		System.out.print("Input an integer: ");
        int num = scanner.nextInt();
        boolean result = num > 5;
        System.out.println(result);
	}

	public static void q3() {
		scanner.nextLine();
		System.out.print("Input pizza: ");
        String word = scanner.next();
        boolean result = word.equals("pizza");
        System.out.println(result);
	}

	public static void q4() {
		System.out.print("Input a number: ");
        double num = scanner.nextDouble();
        boolean result = num == 0;
        System.out.println(result);
	}

	public static void q5() {
		System.out.print("Input an integer: ");
        int num = scanner.nextInt();
        boolean result = num != 0;
        System.out.println(result);
	}

	public static void q6() {
		scanner.nextLine();
        System.out.print("Input a word earlier than google: ");
        String word = scanner.next();
        boolean result = word.compareTo("google") < 0;
        System.out.println(result);
	}

}
