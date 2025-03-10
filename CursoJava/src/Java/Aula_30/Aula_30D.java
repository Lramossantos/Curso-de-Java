package Java.Aula_30;

import java.util.Arrays;

public class Aula_30D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 9, 5, 0, 7, 4, 2, 6, 3, 1, 8 };
		int[] numNovo = new int[20];

		System.arraycopy(num, 0, numNovo, 0, num.length);

		for (int i : numNovo) {
			System.out.printf("%d - ", i);
		}

	}

}

//  System.arraycopy(args, 0, num, 0, 0);
//
//	args: Array de origem.
//
//	0: Posição inicial no array de origem.
//
//	num: Array de destino.
//
//	0: Posição inicial no array de destino.
//
//	0: Número de elementos a copiar.
