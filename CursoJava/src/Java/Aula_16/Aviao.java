/**
 * 
 */
package Java.Aula_16;

/**
 * 
 */
public class Aviao extends Veiculo {

	private int categoria;

	/**
	 * @param categoria
	 * 
	 */
	public Aviao(String nome, int categoria) {
		// TODO Auto-generated constructor stub
		super(nome, 10);
		this.categoria = categoria;
	}

	public void info() {
		super.info();
		System.out.println("categoria:... " + this.categoria);
	}

}
