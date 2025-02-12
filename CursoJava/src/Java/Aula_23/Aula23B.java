package Java.Aula_23;

public class Aula23B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 100;

		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			if (i >= 10 && i <= 60) {
				continue;
			}
			System.out.printf("%d - ", i);
		}

	}

}
