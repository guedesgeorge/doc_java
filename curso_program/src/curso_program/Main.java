package curso_program;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int idade;
		double salario, altura;
		char genero;
		String nome;
		
		idade = 20;
		salario = 3500.0;
		altura = 1.80;
		genero = 'M';
		nome = "George";
		
		// AQUI VAMOS FAZER A CONCATENAÇÃO COM SIMBOLO + 
		System.out.println("IDADE = " + idade);
		System.out.println("SALARIO = " + String.format("%.2f", salario));
		System.out.println("ALTURA = " + String.format("%.2f", altura));
		System.out.println("GENERO = "  + genero);
		System.out.println("NOME = " + nome);
	}

}