/**
 * 
 */
package Java.Aula_09;

/**
 * 
 */
public class Aula_09D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int soma(int... n) {
		int res = 0;
		for (int i : n) {
			res += i;
		}
		return res;
	}
}
