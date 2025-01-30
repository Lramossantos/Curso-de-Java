/**
 * 
 */
package Java.Aula_13;

/**
 * 
 */
public class Aula_13A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Métodos e atributos STATIC - Curso de Java - Aula 13

		int num = 0;
		Jogador.alerta = true;
		Jogador.pontos();
		Jogador.pontos();
		Jogador.pontos();
		
		Jogador j1 = new Jogador(++num);
		Jogador j2 = new Jogador(++num);
		Jogador j3 = new Jogador(++num);
		
		j1.info();						
		j2.info();
		j3.info();

	}
}