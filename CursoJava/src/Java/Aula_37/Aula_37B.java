package Java.Aula_37;

public class Aula_37B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] texto_c = { 'c', 'u', 'r', 's', 'o', ' ', 'd', 'e', ' ', 'j', 'a', 'v', 'a' };
		String texto_s = new String("Leonardo");

		int tam = 0;

		String s1 = new String(texto_c);
		tam = s1.length();

		System.out.println("'c', 'u', 'r', 's', 'o', ' ', 'd', 'e', ' ', 'j', 'a', 'v', 'a'");
		System.out.println(" 1    2    3    4    5    6    7    8    9    10   11   12   13");
		System.out.println("O tamanho da String é de " + tam);

	}

}
