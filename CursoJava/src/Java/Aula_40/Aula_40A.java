/**
 * 
 */
package Java.Aula_40;

/**
 * 
 */
public class Aula_40A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// replace
		// toLowerCase - toUpperCase
		// trim
		// toCharArray
		// split

		String s1 = "Java Solutions - Curso de Java - ";
		String s2 = "youtube.com/javasolutions";
		String s3 = s1.concat(s2);
		String s4;

		System.out.println(s3);
		s4 = s3.replace('a', '#');
		System.out.println(s4);

	}

}
