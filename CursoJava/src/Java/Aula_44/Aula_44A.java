/**
 * 
 */
package Java.Aula_44;

import java.util.Stack;

/**
 * 
 */
public class Aula_44A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<>();
		pilha.push("HRV");
		pilha.push("Golf");
		pilha.push("Polo");
		pilha.push("Camaro");
		pilha.push("Tiggo 3X");
		
		// Tiggo 3X
		// Camaro
		// Polo
		// Golf 
		// HRV
		
		System.out.println("Topo da pila: " + pilha.peek());
		
		for (String string : pilha) {
			System.out.println(string);
		}

	}

}
