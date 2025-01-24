/**
 * 
 */
package Java.Aula_03;

/**
 * 
 */
public class Aula_03D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// == > < := <= != ! (true/false)
		
		//Tabela verdade AND &&
		/*
		 * V V = V
		 * V F = F
		 * F V = F
		 * F F = F
		 * */
		
		//Tabela verdade OR ||
		/*
		 * V V = V
		 * V F = V
		 * F V = V
		 * F F = F 
		 * */

		int nota = 45;
		int media = 60;
		int faltas = 10;
		int maxFaltas = 5;
		
		if ((nota >= media) && (faltas <= maxFaltas)) {
			System.out.println("Aprovado");
		} else if (nota >= 40) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		System.out.println("Fim do Programa");
	}

}
