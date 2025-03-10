package Java.Aula_34;

import java.util.ArrayList;

public class Aula_34D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nome = new ArrayList<>();
		nome.add("Leonardo");
		nome.add("Luan");
		nome.add("Ricardo");

		nome.remove(0);
		nome.remove("Luan");

		nome.trimToSize();

		for (String string : nome) {
			System.out.println(string);
		}

	}

}
