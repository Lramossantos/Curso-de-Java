/**
 * 
 */
package Java.Aula_43;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * 
 */
public class Aula_43B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path logoNova = Paths.get("C:/Users/User/Acesso Rápido/Downloads/Pasta/NovoLogo_Youtube.png");
		Path logoVelha = Paths.get("C:/Users/User/Acesso Rápido/Downloads/Pasta/AntigaLogo_Youtube.png");

		try {
			byte[] byteLogoNova = Files.readAllBytes(logoNova);
			Files.write(logoVelha, byteLogoNova);
			System.out.println("Imagem alterada com sucesso, dentro da pasta!");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro");
		}
	}

}
