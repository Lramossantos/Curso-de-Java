/**
 * 
 */
package Java.Aula_16;

/**
 * 
 */
public class Aula_16A {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// PROTECTED em Java, como usar este modificador de acesso - Curso de Java - Aula 16
		// TODO Auto-generated method stub
		Aviao aviao = new Aviao("Jato", 1);
		Veiculo v1 = new Veiculo("Carro", 2);
		aviao.info();
		v1.nome = "Moto";
		v1.info();
		
		
	}

}
