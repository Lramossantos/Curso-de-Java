/**
 * 
 */
package Java.Aula_14;

/**
 * 
 */
public class Aula_14A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Herança em Java - Curso de Java - Aula 14
		
		Carro c1 = new Carro("Argo");		
		Carro c2 = new Carro("HRV");
		CarroCombate c3 = new CarroCombate("Maverik", 100);
		CarroCombate c4 = new CarroCombate("Tanque", 100);
		
		c3.atirar();
		c3.atirar();
		c3.atirar();
		
		c2.sofrerDano(5);
		c4.sofrerDano(30);
		
		c1.status();
		c2.status();
		c3.status();
		c4.status();
		
		
		
		
		

	}

}
