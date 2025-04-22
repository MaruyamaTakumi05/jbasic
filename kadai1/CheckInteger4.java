import java.util.Scanner;

public class CheckInteger4 {
	public static void main(String[] args) {
		Scanner zyouken = new Scanner(System.in);
		System.out.print("数字を入力してください：");
        int score = zyouken.nextInt();

        if (score % 2 == 0) { //ここで偶数かを判断する
            if (score >= 0) { //ここで正かを判断する
                System.out.println(score + "は正の偶数です"); 
            }else {
                 System.out.println(score + "は不の偶数です");
            } 

        } else {
                if (score >= 0) {
                    System.out.println(score + "は正の奇数です"); 
                 }else {
                    System.out.println(score + "は不の奇数です");
                 }
        }
		zyouken.close();
	}
}