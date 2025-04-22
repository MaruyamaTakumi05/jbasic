public class SwitchSample {
	public static void main(String[] args) {

		Scanner zyouken = new Scanner(System.in);
		System.out.print("色を入力して下さい：");

		int dice = 2;
		switch (dice) {
		case 1:
			System.out.println("大吉です");
			break;
		case 2:
			System.out.println("小吉です");
			break;
		case 3:
			System.out.println("凶です");
			break;
		default:
			System.out.println("吉です");
			break;
		}
	}
}
