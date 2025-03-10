package Java.Aula_30;

import java.util.Arrays;

public class Aula_30F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] n2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] n3 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		int[] n4 = { 10, 4, 7, 23, 4, 10, 8, 0, 4, 9 };
		int[] n5 = new int[10];

		int valor = 8;
		Arrays.sort(n3);

		for (int i : n3) {
			System.out.printf("%d ", i);
		}

		System.out.println();
		int pos = Arrays.binarySearch(n3, valor);

		System.out.printf("%d esta no array? %s - posição:%d%n", valor, pos >= 0 ? "Sim" : "Não", pos);
	}

}
