/**
 * 
 */
package Java.Aula_04;

import java.util.Scanner;

/**
 * 
 */
public class Aula_04A {
//Obtendo dados do teclado com um objeto da classe Scanner - Curso de Java - Aula 04
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n1=0,n2=0,res=0;
		System.out.print("Digite um número: ");
		n1=scan.nextInt();
		
		System.out.print("Digite um número: ");
		n2=scan.nextInt();
		
		res=n1+n2;
		
		System.out.println("Soma: "+res);

	}

}
