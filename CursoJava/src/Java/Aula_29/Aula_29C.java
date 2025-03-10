package Java.Aula_29;

public class Aula_29C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = soma(10, 5, 2);
		System.out.println(res);

	}

	private static int soma(int... v) {
		// TODO Auto-generated method stub
		int res = 0;
		for (int i : v) {
			res = res + i;
		}

		return res;
	}

}
