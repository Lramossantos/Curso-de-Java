package Java.Aula_08;

import java.security.SecureRandom;

public class Aula_08B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int linhas = 5;
		int colunas = 4;
		
		int numeros[][] = new int[linhas][colunas];
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				numeros[i][j] = new SecureRandom().nextInt(100);
			}
		}
		
		
		
		for (int[] is : numeros) {
			
			for (int is2 : is) {
				System.out.printf(" | ", is2);
				System.out.print("__");
				System.out.printf(" | ", is2);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
