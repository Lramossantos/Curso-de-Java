package Java.Aula_30;

import java.util.Arrays;

public class Aula_30E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] n2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] n3 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		int[] n4 = { 10, 4, 7, 23, 4, 10, 8, 0, 4, 9 };

		int[] n5 = new int[10];

		System.out.printf("num1 igual a num2: %s %n", Arrays.equals(n1, n2) ? "igual" : "diferente");
		System.out.printf("num1 igual a num3: %s %n", Arrays.equals(n1, n3) ? "igual" : "diferente");
		System.out.printf("num1 igual a num4: %s %n", Arrays.equals(n1, n4) ? "igual" : "diferente");

	}

}
