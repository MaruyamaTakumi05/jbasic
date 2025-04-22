
       //キーボードから名前を受け取り「ようこそ、（入力された名前）さん」と表示
import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("お名前は？：");
        
		String lastName = scanner.next();//nextは文字列を取ってくる

		System.out.println("ようこそ、" + lastName + "さん");

		scanner.close();
	}
} 
