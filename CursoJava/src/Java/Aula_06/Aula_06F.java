/**
 * 
 */
package Java.Aula_06;

import java.util.Scanner;

/**
 * 
 */
public class Aula_06F {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int tam = 5;
		char[] gabarito = { 'a', 'a', 'd', 'b', 'c' };
		char[] respostas = new char[tam];
		int nota = 0;
		Scanner input = new Scanner(System.in);
		
		respostas[0]='a';
		respostas[1]='b';
		respostas[2]='c';
		respostas[3]='b';
		respostas[4]='b';
		
		for (int i = 0; i < tam; i++) {
			System.out.printf("Informe a nota %d: ", i);
			respostas[i] = input.nextLine().charAt(0);
		}
		
		for (int i = 0; i < tam; i++) {
			if (respostas[i]==gabarito[i]) {
				nota++;
			}		
		}
		System.out.printf("%nNota do aluno: %d",nota);
		
		
	}
}
