/**
 * 
 */
package Java.Aula_49;


import java.util.ArrayList;

/**
 * 
 */
public class Aula_49B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> val = new ArrayList<Integer>();
		ArrayList<Integer> dividido = new ArrayList<Integer>();
		ArrayList<Integer> soma = new ArrayList<Integer>();
		ArrayList<Integer> subtração = new ArrayList<Integer>();

		val.add(1);
		val.add(2);
		val.add(3);
		val.add(4);

		val.forEach((v) -> {
			dividido.add(v / 2);
			soma.add(v + v);
			subtração.add(v - 2);
		});

		System.out.println(val);
		System.out.println(dividido);
		System.out.println(soma);
		System.out.println(subtração);

	}

}
