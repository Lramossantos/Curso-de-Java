package Java.Aula_37;

public class Aula_37C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] texto_c = { 'c', 'u', 'r', 's', 'o', ' ', 'd', 'e', ' ', 'j', 'a', 'v', 'a' };
		String texto_s = new String("Leonardo");
		char c;

		String s1 = new String();
		String s2 = new String(texto_s);
		String s3 = new String(texto_c);
		String s4 = new String(texto_c, 0, 3);

		c = texto_s.charAt(3);
		System.out.println("charAt: " + c);
		System.out.println("Leonardo");
		
		System.out.println("Leonardo");

	}

}
