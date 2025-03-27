/**
 * 
 */
package Java.Aula_49;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * 
 */
public class Aula_49A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<Integer> dobro = new ArrayList<Integer>();
		ArrayList<Integer> par = new ArrayList<Integer>();
		ArrayList<Integer> impar = new ArrayList<Integer>();

		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);

		Consumer<Integer> dobrar = (n) -> {
			dobro.add(n * 2);
			if (n % 2 == 0) {
				par.add(n);
			} else if(n % 2 != 0) {
				impar.add(n);
			}
		};

		num.forEach(dobrar);

		System.out.println(num);
		System.out.println(dobro);
		System.out.println(par);
		System.out.println(impar);

	}

}
