package Java.Aula_44;

/**
 * 
 */
import java.util.Stack;

/**
 * 
 */
public class Aula_44C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> carro = new Stack<>();
		carro.push("HRV");
		carro.push("Golf");
		carro.push("Polo");
		carro.push("Camaro");
		carro.push("Tiggo 3X");

		System.out.println("Topo da Pilha: " + carro.peek());
		System.out.println(carro);
		carro.clear();
		System.out.println(carro.empty() ? "Pilha Vazia" : "Pilha com Elemento");
	}

}
