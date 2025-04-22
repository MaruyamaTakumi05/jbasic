import java.util.Scanner;

public class CheckInteger3 {
	public static void main(String[] args) {
		Scanner zyouken = new Scanner(System.in);
		System.out.print("数字を入力してください：");
        int score = zyouken.nextInt();

        if (score  >= 0  && score <= 130) {
            System.out.println("正しい年齢です");
        } else if (score > 130) {
            System.out.println("0～130で入力して下さい");
        } else if (score < 0) {
            System.out.println("0~130で入力して下さい");
        }

		zyouken.close();
	}
} 