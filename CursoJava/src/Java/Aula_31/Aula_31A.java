package Java.Aula_31;

public class Aula_31A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Como passar parâmetros para o programa? [String[] args] - Curso de Java -
		// Aula 31

		int soma = 0;
		if (args.length <= 0) {
			System.out.printf("%s %n", "Sem valores para soma");
		}

		for (String string : args) {
			int v = Integer.valueOf(string);
			soma = soma + v;
		}
		System.out.printf("Soma dos valores: %d%n", soma);
	}
}
