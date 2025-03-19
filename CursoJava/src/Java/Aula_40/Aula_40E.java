/**
 * 
 */
package Java.Aula_40;

/**
 * 
 */
public class Aula_40E {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// split

		String s1 = "Java Solutions - Curso de Java - ";
		String s2 = "youtube.com/javasolutions";
		String s3 = s1.concat(s2);
		String s4;
		
		String[] link = s3.split(" ");
		System.out.println(s3);
		for (String ancora : link) {
			System.out.println(ancora);
		}
	}

}
