/**
 * 
 */
package Java.Aula_46;


import java.util.HashMap;

/**
 * 
 */
public class Aula_46B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> times = new HashMap<Integer, String>();
		times.put(1, "S.E.Palmeiras");
		times.put(2, "SPFC");
		times.put(3, "S.C.Corinthians");
		times.put(4, "Santos.F.C.");

		times.remove(3);
		times.clear();

		for (String c : times.values()) {
			System.out.println(c);
		}

	}

}
