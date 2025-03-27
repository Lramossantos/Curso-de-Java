/**
 * 
 */
package Java.Aula_41;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 */
public class Aula_41B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path directory = Paths.get("C:/Users/User/git/Curso-de-Java/CursoJava/src/Java/Aula_41");
		Path archives = Paths.get("C:/Users/User/git/Curso-de-Java/CursoJava/src/Java/Aula_41/text.txt");
		if (Files.isDirectory(directory)) {
			System.out.println("Diretorio Existente");
		} else {
			System.out.println("Diretorio Inexistente!");
		}

		if (Files.exists(archives)) {
			System.out.println("Arquivo Existente");
		} else {
			System.out.println("Arquivo Inexistente");
		}

	}

}
