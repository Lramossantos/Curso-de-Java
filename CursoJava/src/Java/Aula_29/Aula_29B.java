package Java.Aula_29;

public class Aula_29B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] valores = { 10, 5, 2, 3, 1, 9, 4 };
		int res = soma(valores);
		System.out.print(res);

	}

	public static int soma(int[] n) {
		int res = 0;
		for (int i : n) {
			res = res + i;
		}
		return res;
	}

}
