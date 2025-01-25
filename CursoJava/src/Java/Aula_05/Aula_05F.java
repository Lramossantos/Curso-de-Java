/**
 * 
 */
package Java.Aula_05;

import java.util.Scanner;

/**
 * 
 */
public class Aula_05F {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int valor;

		System.out.print("Escreva um valor para o loop: ");
		valor = input.nextInt();

		do {
			System.out.println(valor + "° - Linha");
			valor++;
			
		} while (valor < 10);
		System.out.println("Fim do Programa");
	}

}
