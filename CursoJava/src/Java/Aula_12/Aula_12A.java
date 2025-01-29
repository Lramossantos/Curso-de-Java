/**
 * 
 */
package Java.Aula_12;

/**
 * 
 */
public class Aula_12A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		
		Jogador j1 = new Jogador(++num);
		Jogador j2 = new Jogador(++num);		
		
		System.out.println("Vidas do Jogador 1 são " + j1.getVidas() + " vidas");
		System.out.println("Vidas do Jogador 2 são " + j2.getVidas() + " vidas");
	}

}
