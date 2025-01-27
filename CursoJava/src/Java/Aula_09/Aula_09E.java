/**
 * 
 */
package Java.Aula_09;

/**
 * 
 */
public class Aula_09E {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A soma de numeros inteiros foi sobrecarregada e deu o valor de: " + soma(5, 5));
		System.out.println("A soma de numeros inteiros foi sobrecarregada e deu o valor de: " + soma(2.5, 2.5));

	}

	public static int soma(int... numeros) {
		// TODO Auto-generated method stub
		int res = 0;
		for (int i : numeros) {
			res += i;
		}
		return res;
	}

	public static Double soma(Double... numeros) {
		Double res = (double) 0;
		for (Double d : numeros) {
			res += d;
		}
		return res;
	}

}
