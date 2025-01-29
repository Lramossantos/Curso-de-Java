package Java.Aula_11;

public class JogadorB {
	private int num = 0;
	private int vidas = 0;
	
	public JogadorB(int num) {
		this.num=num;
		this.vidas  = 3;
		System.out.printf("Jogador %d criado com sucesso! %n", num);
	}
}
