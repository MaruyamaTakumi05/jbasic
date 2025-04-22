import java.util.Scanner;

public class CheckInteger1 {
	public static void main(String[] args) {
		Scanner lucksystem = new Scanner(System.in);
		System.out.print("数字を入力してください：");
        int score = lucksystem.nextInt();

        if (score == 7) {
            System.out.println("大当たり！");
        } else if (score <= 6) {
            System.out.println("ハズレ");
        } else if (score >= 8) {
            System.out.println("ハズレ");
        }

		lucksystem.close();
	}
} 
