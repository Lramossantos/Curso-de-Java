/**
 * 
 */
package Java.Aula_42;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * 
 */
public class Aula_42A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path arquivo = Paths.get("C:/Users/User/Documentos/text.txt");

		try {
			List<String> linhas = Files.readAllLines(arquivo);
			
			for (String string : linhas) {
				System.out.println(string);
			}
			
			
			
			
			
		} catch (IOException e) {

			System.out.println("ERRO");
		}

	}

}
