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
		this.setVidas(2);
		System.out.printf("Jogador de número %d criado! %n", num);
	}

	public int getVidas() {
		return this.vidas;
	}

	private void setVidas(int vidas) {
		if (vidas > maxVidas) {
			this.vidas = maxVidas;

		} else if (vidas < 0) {
			this.vidas = 0;
		} else {
			this.vidas = vidas;
		}
	}
	
	public void addVidas() {
		if (this.vidas < maxVidas) {
			this.vidas++;
		}else {
			this.vidas = vidas;
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
