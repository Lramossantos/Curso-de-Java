/**
 * 
 */
package Java.Aula_07;

import java.util.Arrays;

/**
 * 
 */
public class Aula_07F {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int tam = 10;

		int[] num = { 9, 2, 7, 1, 8, 5, 3, 4, 0, 6 };
		int[] numeros = new int[tam];
		int p = 3;
		Arrays.sort(num);
		System.out.printf("O elemento %d está no array? %s", p, Arrays.binarySearch(num, p) > 0?"Sim":"Não");

	}

}
