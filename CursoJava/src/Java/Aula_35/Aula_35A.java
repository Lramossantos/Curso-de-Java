package Java.Aula_35;

import java.util.ArrayList;

public class Aula_35A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nome = new ArrayList<>();
		nome.add("Leonardo");
		nome.add("Pedro");

		try {
			System.out.println(nome.get(3));
		} catch (Exception e) {
			System.out.println("ERRO");
		}

	}

}
