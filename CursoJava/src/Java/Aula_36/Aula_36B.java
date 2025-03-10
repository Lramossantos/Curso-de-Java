package Java.Aula_36;

public class Aula_36B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota1, nota2, res;
		nota1 = 60;
		nota2 = 20;

		if (nota1 > 50) {
			throw new IllegalArgumentException("Valor de nota invalido");
		}
		if (nota2 > 50) {
			throw new IllegalArgumentException("Valor de nota invalido");
		}
		
		res = nota1 + nota2;
		System.out.println("Resultado: " + res);

	}

}
