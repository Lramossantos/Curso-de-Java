/**
 * 
 */
package Java.Aula_47;

import java.util.HashSet;

/**
 * 
 */
public class Aula_47A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> nome = new HashSet<String>();
		nome.add("Lucas");
		nome.add("Leonardo");
		nome.add("Leandro");
		nome.add("Luka");
		nome.add("Pedro");
		nome.add("Sebastião");
		nome.add("Simon");
		
		// System.out.println(nome.add("Matheus")?"SIM":"NÃO");
		System.out.println(nome.contains("Lucas")?"Sim":"Não");
		System.out.println(nome);
		
	}

}
