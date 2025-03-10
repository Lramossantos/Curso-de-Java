package Java.Aula_37;

public class Aula_37D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam;
		char c;
		char[] texto_c = { 'c', 'u', 'r', 's', 'o', ' ', 'd', 'e', ' ', 'j', 'a', 'v', 'a' };
		char[] texto_c2 = new char[10];
		String texto_s = new String("Leonardo");

		String s1 = new String();
		String s2 = new String(texto_s);
		String s3 = new String(texto_c);
		String s4 = new String(texto_c, 0, 5);

		tam = texto_s.length();
		System.out.println(tam);

		texto_s.getChars(0, 3, texto_c2, 0);
		System.out.println(texto_c2);

	}
}
