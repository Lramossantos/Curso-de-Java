package Java.Aula_15;

public class Veiculo {
	private String nome;
	private int tipo;

	public Veiculo(String nome, int tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public void info() {
		System.out.println("-------------------------");
		System.out.printf("Nome----------: %s %n", this.nome);
		System.out.printf("Tipo----------: %d %n", this.tipo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	

}
