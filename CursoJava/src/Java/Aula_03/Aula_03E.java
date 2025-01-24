/**
 * 
 */
package Java.Aula_03;

/**
 * 
 */
public class Aula_03E {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota = 85;
		int media = 60;
		int faltas = 10;
		int maxFaltas = 5;
		int res;
		
		
		res=(nota >= media ? 1 : 0);
		
		System.out.println("Resultado: " + (res==1?"Aporvado":"Reprovado"));
		
	}
}
