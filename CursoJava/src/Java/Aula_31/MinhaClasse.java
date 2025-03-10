package Java.Aula_31;

public class MinhaClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Verifica se foram passados argumentos
		if (args.length > 0) {
			System.out.println("Argumentos recebidos:");
			for (String arg : args) {
				System.out.println(arg);
			}
		} else {
			System.out.println("Nenhum argumento foi passado.");
		}

		// Chama outro método
		saudacao();
	}

	public static void saudacao() {
		System.out.println("Olá, mundo!");
	}

}
