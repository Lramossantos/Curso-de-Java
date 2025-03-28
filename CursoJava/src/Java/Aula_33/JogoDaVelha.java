package Java.Aula_33;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		Campo[][] velha = new Campo[3][3];
		char simboloAtual = 'X';
		Boolean game = true;
		String vitoria = "";
		Scanner scan = new Scanner(System.in);

		iniciarJogo(velha);
		
		while (game == true) {
			desenharJogo(velha);
			vitoria = verificaVitoria(velha);
			if (!vitoria.equals("")) {
				System.out.printf("Jogador %s venceu %n", vitoria);
				break;
			}
			try {
				if (verificaJogada(velha, jogar(scan, simboloAtual), simboloAtual)) {
					if (simboloAtual == 'X') {
						simboloAtual = 'O';
					} else {
						simboloAtual = 'X';
					}
				}
			} catch (Exception e) {
				System.out.printf("Erro");
			}
		}
		limparTela();

	}

	private static void desenharJogo(Campo[][] velha) {		
		System.out.println("  0    1    2");
		System.out.printf("0  %c | %c | %c %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
		System.out.printf("  -------------%n");
		System.out.printf("1  %c | %c | %c %n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
		System.out.printf("  -------------%n");
		System.out.printf("2  %c | %c | %c %n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());		
	}
	
	private static void limparTela() {
		for (int i = 0; i < 200; i++) {
			System.out.println("");
		}

	}

	public static int[] jogar(Scanner scan, char sa) {
		int p[] = new int[2];
		System.out.println();
		System.out.printf("%s %c %n", "Quem Joga: ", sa);
		System.out.print("Informa a linha: ");
		p[0] = scan.nextInt();
		System.out.print("Informa a coluna: ");
		p[1] = scan.nextInt();
		return p;

	}

	private static boolean verificaJogada(Campo[][] velha, int p[], char simboloAtual) {
		if (velha[p[0]][p[1]].getSimbolo() == ' ') {
			velha[p[0]][p[1]].setSimbolo(simboloAtual);
			return true;
		} else {
			return false;
		}
	}

	public static void iniciarJogo(Campo[][] velha) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				velha[i][j] = new Campo();
			}
		}

	}

	public static String verificaVitoria(Campo[][] velha) {

	    for (int i = 0; i < 3; i++) {
	        if (velha[i][0].getSimbolo() != ' ' && 
	            velha[i][0].getSimbolo() == velha[i][1].getSimbolo() && 
	            velha[i][1].getSimbolo() == velha[i][2].getSimbolo()) {
	            return String.valueOf(velha[i][0].getSimbolo()); // Retorna o símbolo do vencedor
	        }
	    }


	    for (int j = 0; j < 3; j++) {
	        if (velha[0][j].getSimbolo() != ' ' && 
	            velha[0][j].getSimbolo() == velha[1][j].getSimbolo() && 
	            velha[1][j].getSimbolo() == velha[2][j].getSimbolo()) {
	            return String.valueOf(velha[0][j].getSimbolo()); // Retorna o símbolo do vencedor
	        }
	    }


	    if (velha[0][0].getSimbolo() != ' ' && 
	        velha[0][0].getSimbolo() == velha[1][1].getSimbolo() && 
	        velha[1][1].getSimbolo() == velha[2][2].getSimbolo()) {
	        return String.valueOf(velha[0][0].getSimbolo()); // Retorna o símbolo do vencedor
	    }


	    if (velha[0][2].getSimbolo() != ' ' && 
	        velha[0][2].getSimbolo() == velha[1][1].getSimbolo() && 
	        velha[1][1].getSimbolo() == velha[2][0].getSimbolo()) {
	        return String.valueOf(velha[0][2].getSimbolo()); // Retorna o símbolo do vencedor
	    }


	    return "";
	}
		

	}

// Como criar um jogo da velha em Java? [Aula prática] - Curso de Java - Aula 33