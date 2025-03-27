/**
 * 
 */
package Java.Aula_43;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 */
public class Aula_43A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Path logoNova = Paths.get("C:/Users/User/Acesso Rápido/Downloads/Pasta/NovoLogo_Youtube.png");
		Path logoAntiga = Paths.get("C:/Users/User/Acesso Rápido/Downloads/Pasta/AntigaLogo_Youtube.png");

		try {
			byte[] byteLogoNova = Files.readAllBytes(logoNova);
			Files.write(logoAntiga, byteLogoNova);
			// Grava byteLogoNova em logoAntiga, substituindo o conteúdo.
		} catch (Exception e) {
			System.out.println("ERRO");
		}

	}
}
