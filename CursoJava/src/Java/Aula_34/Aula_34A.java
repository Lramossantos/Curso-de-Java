package Java.Aula_34;

import java.util.ArrayList;

public class Aula_34A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<String> carros = new ArrayList<>();

		numeros.add(11);
		numeros.add(22);
		numeros.add(33);

		carros.add("HRV");
		carros.add("Polo");
		carros.add(0, "Cruze");

		for (int e : numeros) {
			System.out.println(e);
		}

		for (String string : carros) {
			System.out.println(string);
		}
	}

}
