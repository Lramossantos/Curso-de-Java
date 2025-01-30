package Java.Aula_13;

public class Jogador {

	private final int maxVidas = 3;
	private int vida = 0;
	private int numJogador = 0;
	private int minVidas;
	static boolean alerta = false;
	static int qtdJogadores = 0;
	static int pontosJogadores = 0;

	public Jogador(int numJogador) {
		this.vida = 1;
		this.numJogador = numJogador;
		System.out.printf("Jogador %d criado com sucesso!%n", numJogador);
		qtdJogadores++;
	}

	/**
	 * @return the vida
	 */
	public int getVida() {
		return vida;
	}

	/**
	 * @param vida the vida to set
	 */
	public void setVida(int vida) {
		if (vida > maxVidas) {
			this.vida = maxVidas;
		} else if (vida < minVidas) {
			this.vida = minVidas;
		} else {
			this.vida = vida;
		}
	}

	/**
	 * @return the numJogador
	 */
	public int getNumJogador() {
		return numJogador;
	}

	/**
	 * @param numJogador the numJogador to set
	 */
	public void setNumJogador(int numJogador) {
		this.numJogador = numJogador;
	}

	public void addVida() {
		if (this.vida < maxVidas) {
			this.vida++;
		}
	}

	static void pontos() {
		pontosJogadores += 10;
	}

	public void info() {
		System.out.printf("%nNúmero do jogador: %d", this.numJogador);
		System.out.printf("%nVidas: %d", this.vida);
		System.out.printf("%nAlerta: %s", alerta ? "Sim" : "Não");
		System.out.printf("%nJogadores: %d", qtdJogadores);
		System.out.printf("%nPontos: %d", pontosJogadores);
		System.out.printf("%n--------------------------------------%n");
	}

}
