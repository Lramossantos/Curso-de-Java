package Java.aula_26;

import java.util.Iterator;
import java.util.Scanner;

public class Aula_26A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numQuestão = 5;
		char resp;
		char respostas[] = new char[numQuestão];
		double nota = 0, pontoQuestao = 2;
		String nome = "";
		Boolean status;

		char[] gabarito = { 'b', 'b', 'b', 'a', 'b' };

		String[] perguntas = { "Qual é o maior planeta do Sistema Solar?", "Quem escreveu a peça (Romeu e Julieta)?",
				"Qual é a capital da França?", "Quantos lados tem um triângulo?",
				"Qual é o nome do protagonista do livro (Dom Quixote)?" };

		String[] resposta = { "A) Terra | B) Júpiter | C) Marte",
				"A) Machado de Assis | B) William Shakespeare | C) Fernando Pessoa", "A) Berlim | B) Paris | C) Roma",
				"A) 3 | B) 4 | C) 5", "A) Sancho Pança | B) Dom Quixote | C) Dulcineia" };

		System.out.print("Digite seu nome: ");
		nome = input.nextLine();

		System.out.println(nome + " Agora se prepare para iniciar o jogo de perguntas!");

		for (int i = 0; i < numQuestão; i++) {
			System.out.println(perguntas[i]);
			System.out.println(resposta[i]);
			resp = input.nextLine().charAt(0);
			System.out.println("");
			respostas[i] = resp;
		}

		for (int i = 0; i < numQuestão; i++) {
			if (gabarito[i] == respostas[i]) {
				nota = nota + pontoQuestao;
			}
		}

		System.out.printf("%s sua nota foi (%.2f). Você foi, %s", nome, nota, nota > 6 ? "Aprovado" : "Reprovado");
	}
}
