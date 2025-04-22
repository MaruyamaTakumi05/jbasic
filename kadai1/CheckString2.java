import java.util.Scanner;

public class CheckString2 {
	public static void main(String[] args) {

		Scanner zyouken = new Scanner(System.in);
		System.out.print("色を入力して下さい：");

		String dice = zyouken.next();
		switch (dice) {
		case "red":
			System.out.println("赤です");
			break;
		case "green":
			System.out.println("緑です");
			break;
		case "blue":
			System.out.println("青です");
			break;
		default:
			System.out.println("他の色を入力して下さい");
			break;
		}
	}
}
