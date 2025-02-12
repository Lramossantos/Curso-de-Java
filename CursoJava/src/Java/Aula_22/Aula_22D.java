package Java.Aula_22;
import java.util.Iterator;
import java.util.Scanner;

public class Aula_22D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int prova[] = new int[3];

		System.out.println("--------Programa de Médias---------");

		for (int i = 0; i < prova.length; i++) {
			System.out.println("Digite a 1° nota: ");
			prova[i] = scan.nextInt();
			break;
		}

		switch (prova[0]) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("Aprovado");
			break;
		case 6:
		case 5:
		case 4:
			System.out.println("Recuperação");
			break;
		
			
		default:
			System.out.println("Reprovado");
			break;
		}

	}
}
