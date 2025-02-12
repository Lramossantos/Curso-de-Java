package Java.Aula_24;

public class Aula_24B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		num[0] = 52;
		num[1] = 100;
		num[2] = 3;
		num[3] = 15;
		num[4] = 527;

		for (int i = num.length - 1; i >= 0; i--) {
			System.out.printf("%d %n", num[i]);
		}
	}

}
