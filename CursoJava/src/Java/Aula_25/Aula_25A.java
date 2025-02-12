/**
 * 
 */
package Java.Aula_25;

/**
 * 
 */
public class Aula_25A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Como criar Array de tipo personalizado [Aprenda nesta aula] - Curso de Java -
		// Aula 25

		final int nomeCarros = 5;
		Carro[] carros = new Carro[5];
		String modeloCarros[] = { "HRV", "Golf", "Camaro", "Mustang", "Toro" };

		// inicializar o arrar carros
		for (int i = 0; i < nomeCarros; i++) {
			carros[i] = new Carro(modeloCarros[i]);
		}

		// Imprimir Carros
		for (Carro c : carros) {
			c.status();
		}

	}

}
