import java.util.Scanner;

public class CheckString1 {
	public static void main(String[] args) {
		Scanner zyouken = new Scanner(System.in);
		System.out.print("パスワードを入力して下さい：");
       
        String passward = zyouken.next();//入力されたものを”passward"代入　・数字だったらint

        if (passward.equals("himitu")) { //equalsは中身が（）の中身との整合性を確認
        
            System.out.print("一致しました");

        }else {
            System.out.print("一致しませんでした");
        }

		zyouken.close();
	}
}