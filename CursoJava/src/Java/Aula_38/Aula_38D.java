/**
 * 
 */
package Java.Aula_38;

/**
 * 
 */
public class Aula_38D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// regionMatches

		String s1 = new String("Leonardo");
		String s2 = "Leonardo";
		String s3 = "Curso de Java";
		String s4 = "leonardo.tech2024@gmail.com";
		String s5 = "leonardoramosdossantos92@gmail.com";
		String s6 = "Leonardo";

		System.out.println(s4.regionMatches(true, 0, s5, 0, 8) ? "s4 é igual a s5" : "s4 é diferente de s5");

	}

}
