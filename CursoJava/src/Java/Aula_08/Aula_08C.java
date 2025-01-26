/**
 * 
 */
package Java.Aula_08;

/**
 * 
 */
public class Aula_08C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][] = { { 10, 20, 30, 40}, { 1, 2, 3, 4, 5}, { 100, 200, 300, 400, 500, 600 } };
		for (int[] is : num) {
			for (int is2 : is) {
				System.out.printf("|%3d|", is2);
			}
			System.out.println("");
		}

	}

}
