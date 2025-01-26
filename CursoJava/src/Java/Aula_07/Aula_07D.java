/**
 * 
 */
package Java.Aula_07;

import java.util.Arrays;

/**
 * 
 */
public class Aula_07D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int tam = 10;

		int[] num = { 9, 2, 7, 1, 8, 5, 3, 4, 0, 6 };
		int[] numeros = new int[tam];

		System.arraycopy(num, 0, numeros, 0, tam);

		for (int i : num) {
			System.out.print(i + " - ");
		}
	}

}
