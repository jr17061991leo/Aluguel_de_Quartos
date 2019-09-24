package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		int[] quarto = new int[10];
		Aluno[] dadosAluno = new Aluno[10];

		System.out.println("Número de estudantes: ");
		int numEstudantes = in.nextInt();
		in.nextLine();

		for (int i = 1; i <= numEstudantes; i++) {
			System.out.println("escolha o quarto do estudante " + i + ":");
			quarto[i] = in.nextInt();
			in.nextLine();
			System.out.println("digite o nome do aluno e o email: ");
			String nome = in.nextLine();
			String Email = in.nextLine();
			dadosAluno[i] = new Aluno(nome, Email);

		}
		for (int i = 0; i < quarto.length; i++) {
			if (quarto[i] != 0) {
				System.out.println(quarto[i] + ": " + dadosAluno[i].getNome() + ", " + dadosAluno[i].getEmail());

			} else {};

		}

		in.close();
	}

}
