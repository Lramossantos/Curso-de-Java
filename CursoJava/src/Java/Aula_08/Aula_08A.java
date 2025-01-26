/**
 * 
 */
package Java.Aula_08;

import java.security.SecureRandom;

/**
 * 
 */
public class Aula_08A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Matrizes em Java - Curso de Java - Aula 08

		final int linhas = 3;
		final int colunas = 5;

		int[][] numeros = new int[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				numeros[i][j] = new SecureRandom().nextInt(101);
			}
		}

		for (int l = 0; l < linhas; l++) {
			for (int c = 0; c < colunas; c++) {
				System.out.printf("%3d |",numeros[l][c]);
				numeros[l][c] = new SecureRandom().nextInt();			
			}
			System.out.println();
		}

	}

}
