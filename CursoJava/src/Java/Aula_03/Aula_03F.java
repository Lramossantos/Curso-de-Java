/**
 * 
 */
package Java.Aula_03;

/**
 * 
 */
public class Aula_03F {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos = 4;
		
		switch (pos) {
		
		case 1: 
			System.out.println("Primeiro Lugar");
			break;
			
		case 2: 
			System.out.println("Segundo Lugar");
			break;
			
		case 3:
			System.out.println("Terceiro Lugar");
			break;
			
		case 4: case 5: case 6:
			System.out.println("Premio de Participação");
			
		default:
			System.out.println("Não subio no podio");
			break;
		}
		
	}
}
