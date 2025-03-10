package Java.Aula_28;

public class Aula_28A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Passagem por valor e por referência em Java. Será que existe em Java? - Curso
		// de Java - Aula 28

		int[] notas = { 10, 85, 62, 45, 98, 78, 88, 60, 67, 82 };
		int[] resultado = { 0, 0 };

		conferirNotas(notas, resultado);

		System.out.printf("Aprovados: %d%n", resultado[0]);
		System.out.printf("Reprovados: %d%n", resultado[1]);

	}

	public static void conferirNotas(int notas[], int[] res) {
		for (int i : notas) {
			if (i >= 60) {
				res[0]++;
			} else {
				res[1]++;
			}
		}
	}
}
