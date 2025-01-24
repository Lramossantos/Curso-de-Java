/**
 * 
 */
package Java.Aula_04;

import java.util.Scanner;

/**
 * 
 */
public class Aula_04D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, soma = 0;
		final int media = 6;
		float nota = 0;
		String nome = "", status = "";

		System.out.print("Digite o nome do aluno: ");
		nome = input.next();

		System.out.print("Digite a primeira nota: ");
		n1 = input.nextInt();

		System.out.print("Digite a segunda nota: ");
		n2 = input.nextInt();

		System.out.print("Digite a terceira nota: ");
		n3 = input.nextInt();

		System.out.print("Digite a quarta nota: ");
		n4 = input.nextInt();

		soma = (n1 + n2 + n3 + n4)/4;

		if (soma >= media) {
			status="Aprovado";
		}else if(soma >= 4) {
			status="Recuperação";		
		}else {
			status="Reprovado";
		}
		
		nota = soma;

		System.out.printf("Nome do Aluno: %s | Status: %s | Nota: %.2f(pontos) | ", nome, status, nota);

	}

}
