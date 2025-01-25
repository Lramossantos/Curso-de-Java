/**
 * 
 */
package Java.Aula_05;

import java.util.Scanner;

/**
 * 
 */
public class Aula_05E {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int max = input.nextInt();
		int n = 0;

		while (n < max) {
			System.out.printf("%d° é o numero loop \n", n);
			n++;
		}

	}

}
