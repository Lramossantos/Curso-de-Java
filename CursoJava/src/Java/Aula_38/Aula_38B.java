package Java.Aula_38;

public class Aula_38B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// equalsIgnoreCase
		// compareTo
		// regionMatches

		String s1 = new String("Leonardo");
		String s2 = "Leonardo";
		String s3 = "Curso de Java";
		String s4 = "leonardoramosdossantos92@gmail.com";
		String s5 = "leonardoramosdossantos92@gmail.com";
		String s6 = "Leonardo";

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
