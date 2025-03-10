package Java.Aula_27;

public class Aula_27A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Passando Arrays como parâmetros para funções - Curso de Java - Aula 27

		String nome = "Leonardo";
		for (char c : nome.toCharArray()) {
			System.out.printf("%c ", c);
		}

		System.out.println();

		char nome1[] = new char[8];
		nome1[0] = 'L';
		nome1[1] = 'e';
		nome1[2] = 'o';
		nome1[3] = 'n';
		nome1[4] = 'a';
		nome1[5] = 'r';
		nome1[6] = 'd';
		nome1[7] = 'o';

		for (int i = 0; i < nome1.length; i++) {
			System.out.printf("%c ", nome1[i]);
		}

	}

}
