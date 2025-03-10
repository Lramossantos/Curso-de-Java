package Java.Aula_27;

public class Aula_27B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = { 10, 5, 15, 20, 100, 25, 14, 8, 3, 98, 75, 62 };
//		parImpar(numeros);
		imparPar(numeros);

	}

//	public static void parImpar(int[] n) {
//		for (int i : n) {
//			if (i % 2 == 0) {
//				System.out.println(i + " Par");
//			} else if (i % 2 != 0) {
//				System.out.println(i + " Ímpar");
//			}
//		}

	public static void imparPar(int[] numeros) {
		String res = "";
		for (int i : numeros) {
			if (i % 2 == 0) {
				res = "PAR";
			} else if (i % 2 != 0) {
				res = "ÍMPAR";
			}
			System.out.printf("%d:%s %n", i, res);
		}

	}

}
