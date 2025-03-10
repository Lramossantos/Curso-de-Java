package Java.Aula_30;

import java.util.Arrays;

public class Aula_30C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 9, 5, 0, 7, 4, 2, 6, 3, 1, 8 };
		int[]numNovo = new int[10];
		
		Arrays.fill(numNovo, 10);
		for (int i : numNovo) {
			System.out.printf("%d - ", i);
		}

	}

}
