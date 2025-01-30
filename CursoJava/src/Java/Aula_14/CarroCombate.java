package Java.Aula_14;

public class CarroCombate extends Carro{

	private final int maxArmamento = 100;
	private final int minArmamento = 0;
	private int qtdeArmamento;
	
	public CarroCombate(String nome, int blindagem) {
		super(nome);
		super.setArmamento(true);
		super.setBlindagem(blindagem);
		this.qtdeArmamento = 100;		
	}
	
	

	public int getQtdeArmamento() {
		return qtdeArmamento;
	}



	public void setQtdeArmamento(int qtdeArmamento) {
		this.qtdeArmamento += qtdeArmamento;
		if (this.qtdeArmamento > maxArmamento) {
			this.qtdeArmamento=maxArmamento;
		} 
		
		if (this.qtdeArmamento < minArmamento) {
			this.qtdeArmamento = minArmamento;
		}		
	}
	
	

	public int getMaxArmamento() {
		return maxArmamento;
	}



	public int getMinArmamento() {
		return minArmamento;
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
	public boolean isLigado() {
		// TODO Auto-generated method stub
		return super.isLigado();
	}

	@Override
	public void setLigado(boolean ligado) {
		// TODO Auto-generated method stub
		super.setLigado(ligado);
	}

	@Override
	public boolean isDestruido() {
		// TODO Auto-generated method stub
		return super.isDestruido();
	}

	@Override
	public void setDestruido(boolean destruido) {
		// TODO Auto-generated method stub
		super.setDestruido(destruido);
	}

	@Override
	public int getBlindagem() {
		// TODO Auto-generated method stub
		return super.getBlindagem();
	}

	@Override
	public void setBlindagem(int blindagem) {
		// TODO Auto-generated method stub
		super.setBlindagem(blindagem);
	}

	@Override
	public boolean isArmamento() {
		// TODO Auto-generated method stub
		return super.isArmamento();
	}

	@Override
	public void setArmamento(boolean armamento) {
		// TODO Auto-generated method stub
		super.setArmamento(armamento);
	}

	@Override
	public void sofrerDano(int dano) {
		// TODO Auto-generated method stub
		super.sofrerDano(dano);
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		super.status();
		System.out.printf("qtdeArmamento..........:%s%n", this.qtdeArmamento);
	}
	
	public void atirar() {
		if (this.qtdeArmamento > minArmamento) {
			setQtdeArmamento(-1);
		}else {
			System.out.println("Sem munição!");
		}
	}
}
