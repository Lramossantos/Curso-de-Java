/**
 * 
 */
package Java.Aula_04;

import java.util.Scanner;

/**
 * 
 */
public class Aula_04B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n1=0, n2=0, res=0;		
				
		System.out.print("Digite um numeral: ");
		n1=scan.nextInt();
		
		System.out.print("Digite outro numeral: ");
		n2=scan.nextInt();
		
		res=n2+n1;
		
		System.out.printf("Soma de %d mais %d é igual a %d",n1,n2,res);

	}

}
