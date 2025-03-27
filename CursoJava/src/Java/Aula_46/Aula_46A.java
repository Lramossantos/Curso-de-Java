/**
 * 
 */
package Java.Aula_46;

import java.util.HashMap;

/**
 * 
 */
public class Aula_46A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> carros = new HashMap<Integer, String>();
		carros.put(1, "Polo");
		carros.put(2, "HRV");
		carros.put(3, "Golf");
		carros.put(4, "Camaro");
		carros.put(5, "Mustang");
		carros.put(6, "Cruze");

		System.out.println(carros);
		
		for (int i = 1; i <= carros.size(); i++) {
			System.out.println(carros.get(i));
		}

	}

}
