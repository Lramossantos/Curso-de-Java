package Java.Aula_38;

public class Aula_38C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// compareTo
		// regionMatches

		String s1 = new String("Leonardo");
		String s2 = "Leonardo";
		String s3 = "Curso de Java";
		String s4 = "leonardoramosdossantos92@gmail.com";
		String s5 = "leonardoramosdossantos92@gmail.com";
		String s6 = "Leonardo";

		System.out.println(s2);

		int res = s3.compareTo(s1);
		if (res == 0) {
			System.out.println("s3 é igual a s1");
		} else if (res < 0) {
			System.out.println("s3 é menor que s1, por favor digite mais!");
		} else if (res > 0) {
			System.out.println("s3 é maior que s1, por favor digite menos!");
		}

	}

}
