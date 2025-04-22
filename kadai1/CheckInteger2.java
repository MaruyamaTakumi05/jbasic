import java.util.Scanner;

public class CheckInteger2 {
	public static void main(String[] args) {
		Scanner hikaku = new Scanner(System.in);

		System.out.print("Xの値を入力して下さい：");
        int score = hikaku.nextInt();

        System.out.print("ｙの値を入力して下さい：");
        int score2 = hikaku.nextInt();



        if (score > score2) {
            System.out.println("ｘはYより大きい");
        } else if (score < score2) {
            System.out.println("xはyより小さい");
        } else {
             System.out.println("xとyは等しい");
        }

		hikaku.close();
	}
} 