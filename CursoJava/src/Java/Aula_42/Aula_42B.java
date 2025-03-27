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
public class Aula_42B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path arquivo = Paths.get("C:/Users/User/Documentos/text.txt");
		try {
			List<String> linhas = Files.readAllLines(arquivo);
			linhas.forEach(linha -> System.out.println(linha));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERRO");
		}

	}

}
