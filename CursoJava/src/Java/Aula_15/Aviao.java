package Java.Aula_15;

public class Aviao extends Veiculo {
	private int categoria;

	public Aviao(String nome, int categoria) {
		super(nome, 10);
		this.categoria = categoria;
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();		
		System.out.printf("Categoria-----: %d %n", this.categoria);
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public int getTipo() {
		// TODO Auto-generated method stub
		return super.getTipo();
	}

	@Override
	public void setTipo(int tipo) {
		// TODO Auto-generated method stub
		super.setTipo(tipo);
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	

}
