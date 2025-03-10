package Java.Aula_35;

import java.util.ArrayList;

public class Aula_35C {

	public static void main(String[] args) {
		ArrayList<String> nome = new ArrayList<>();
		nome.add("Lucas");
		nome.add("Luiz");
		nome.add("Heitor");

		try {
			System.out.println(nome.get(2));
		} catch (RuntimeException e) {
			System.out.println("Erro: Erros em tempo de execução");
		} finally {
			System.out.println("Fim do Try");
		}

	}

}
