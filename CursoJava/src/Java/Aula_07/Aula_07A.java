/**
 * 
 */
package Java.Aula_07;

/**
 * 
 */
public class Aula_07A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 10, 20, 30, 40, 50 };
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d - ", num[i]);			
		}
		
		System.out.println("");
		
		for (int i : num) {
			System.out.printf("%d - ", i);
		}
	}	
}
