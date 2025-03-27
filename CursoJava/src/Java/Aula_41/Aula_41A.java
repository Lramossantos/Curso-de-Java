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
public class Aula_41A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path directory = Paths.get("C:/Users/User/git/Curso-de-Java/CursoJava/src/Java/Aula_41");

		if (Files.isDirectory(directory)) {
			System.out.println("Diretório Existente!");
		} else {
			System.out.println("Diretorio não Existente!");
		}

	}
}