package Java.Aula_32;

import java.security.SecureRandom;

public class Aula_32B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int linhas = 3;
		final int colunas = 3;

		int num[][] = new int[linhas][colunas];
		gerarDados(num, linhas, colunas);
		impimirDados(num, linhas, colunas);

	}

	private static void gerarDados(int[][] num, int linhas, int colunas) {
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				num[i][j] = new SecureRandom().nextInt(100);
			}
			
		}
	}

	private static void impimirDados(int[][] num, int linhas, int colunas) {
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.printf("%2d | ", num[i][j]);
			}
			System.out.println();
		}
	}
}
