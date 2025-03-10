package Java.Aula_30;

import java.util.Arrays;

public class Aula_30B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 9, 5, 0, 7, 4, 2, 6, 3, 1, 8 };
		Arrays.sort(num);

		for (int i : num) {
			System.out.print("-" + i);
		}
	}
}
