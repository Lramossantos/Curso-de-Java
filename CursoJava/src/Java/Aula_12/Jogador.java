/**
 * 
 */
package Java.Aula_12;

/**
 * 
 */
public class Jogador {
	
	private final int maxVidas = 3;
	private int num = 0;
	private int vidas = 0;

	public Jogador(int num) {
		this.num = num;
		this.vidas = 3;
		System.out.printf("Jogador de número %d criado! %n", num);
	}

	public int getVidas() {
		return this.vidas;
	}
	
	public void setVidas(int vidas) {
		if(vidas > maxVidas) {
			System.out.println("Valor acima do limite");
			this.vidas = maxVidas;
			
		} else if(vidas < 0) {
			this.vidas = 0;			
		}
		this.vidas=vidas;
	}

}
