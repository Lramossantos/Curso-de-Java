package Java.Aula_31;

import java.util.ArrayList;
import java.util.Scanner;

public class OlaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Cria um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede para o usuário digitar o nome
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine(); // Lê o nome digitado

        // Exibe a mensagem
        System.out.println("Olá, " + nome + "!");

        scanner.close(); // Fecha o Scanner

        ArrayList<String> carros = new ArrayList<>();
	}

}
