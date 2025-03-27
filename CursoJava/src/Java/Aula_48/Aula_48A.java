/**
 * 
 */
package Java.Aula_48;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 */
public class Aula_48A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> times = new ArrayList<String>();
		times.add("Palmeiras");
		times.add("Corinthians");
		times.add("São Paulo");
		times.add("Santos");
		times.add("Brangantino");

		System.out.println(times);

		Iterator<String> it = times.iterator();
		while (it.hasNext()) {
			String c = it.next();
			if (c == "Palmeiras") {
				it.remove();
			}
		}		
		System.out.println(times);
	}

}
