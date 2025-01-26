/**
 * 
 */
package Java.Aula_07;

import java.util.Arrays;

/**
 * 
 */
public class Aula_07B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 9, 2, 7, 1, 8, 5, 3, 4, 0, 6 };
		
		Arrays.sort(num);
		for (int i : num) {
			System.out.print(i + " - ");
		}
	}

}
