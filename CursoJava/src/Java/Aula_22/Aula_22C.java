package Java.Aula_22;

import java.util.Scanner;

public class Aula_22C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String operador;
		int n1 = 0, n2 = 0, res = 0;
		Scanner scan = new Scanner(System.in);

		System.out.printf("Digite o primeiro valor: ");
		n1 = scan.nextInt();

		System.out.printf("Digite o segundo valor: ");
		n2 = scan.nextInt();

		System.out.println("Qual operação deseja fazer? :");
		System.out.println("Adição [+]| Subtração [-]| Divisão [/]| Multiplicação[*]");
		operador = scan.next();

		switch (operador) {
		case "+":
			res = n1 + n2;
			break;

		case "-":
			res = n1 - n2;
			break;

		case "/":
			res = n1 / n2;
			break;

		case "*":
			res = n1 * n2;
			break;

		default:
			System.out.println("Operador invalido!");
			break;
		}
		System.out.printf("Operação: %s | Resultado: %d", operador, res);
	}

}
