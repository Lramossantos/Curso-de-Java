package Java.Aula_32;

import java.security.SecureRandom;
import java.util.Arrays;

public class Aula_32A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Aprendendo sobre MATRIZES em JAVA - Curso de Java - Aula 32

		final int linhas = 5, colunas = 5;
		int[][] numeros = new int[linhas][colunas];

		for (int l = 0; l < linhas; l++) {
			for (int c = 0; c < colunas; c++) {
				numeros[l][c] = new SecureRandom().nextInt(100);
			}
		}

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(numeros[i][j] + " - ");
			}
			System.out.println();
		}
	}

}
