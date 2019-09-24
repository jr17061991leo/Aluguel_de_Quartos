package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		int[] quarto = new int[10];
		Aluno dadosAluno = new Aluno();

		System.out.println("Número de estudantes: ");
		int numEstudantes = in.nextInt();
		in.nextLine();

		for (int i = 1; i <= numEstudantes; i++) {
			System.out.println("escolha o quarto do estudante " + i + ":");
			int numQuarto = in.nextInt();
			quarto[numQuarto] = in.nextInt();
			System.out.println("digite o nome do aluno e o email: ");
			String nome = in.nextLine();
			String Email = in.nextLine();
			dadosAluno = new Aluno(nome, Email);

		}

		in.close();
	}

}
