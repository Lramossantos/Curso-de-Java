/**
 * 
 */
package Java.Aula_17;

import java.util.Scanner;

/**
 * 
 */
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Numero n1 = new Numero();
		Numero n2 = new Numero();
		Numero res = new Numero();
		String opcao = "S";

		while (opcao.equals("S") || opcao.equals("s")) {
			System.out.printf("Digite o valor 1: ");
			n1.setValor(input.nextInt());

			System.out.printf("%nDigite o valor 2: ");
			n2.setValor(input.nextInt());

			res.setValor(n1.getValor() + n2.getValor());
			System.out.printf("%d + %d = %d%n%n", n1.getValor(), n2.getValor(), res.getValor());

			System.out.println("Deseja somar outro valor?: ");
			opcao = input.next();
		}

	}

}
