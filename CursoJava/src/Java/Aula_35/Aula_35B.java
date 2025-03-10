package Java.Aula_35;

import java.util.ArrayList;

public class Aula_35B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> carro = new ArrayList<>();
		carro.add("Golf");
		carro.add("Uno");
		carro.add("Fusca");
		carro.add("Onix");

		try {
			System.out.println(carro.get(10));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
