/**
 * 
 */
package Java.Aula_16;

/**
 * 
 */
public class Veiculo {

	protected String nome;
	private int tipo;

	public Veiculo(String nome, int tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}	
	
	public void info() {	
		System.out.println("--------------");
		System.out.println("Nome:........ " + this.nome);
		System.out.println("Tipo:........ " + this.tipo);
	}

}
