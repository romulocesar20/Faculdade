package trabalho;

import java.util.ArrayList;
import java.util.Scanner;
import trabalho.Materia;
import trabalho.Aprovacao;
import trabalho.CadastroMateria;


public class Main {
	static int escolha;
	static String aNome;
	static int aAno;
	static double aNp1;
	static double aNp2;
	static double aSub;
	static double aExame;
	static int opcao;
	
	static ArrayList<Materia>listaMaterias = new ArrayList<Materia>();
	static ArrayList<Aprovacao>listaNotas = new ArrayList<Aprovacao>();
	static ArrayList<Aprovacao>listaAprovado = new ArrayList<Aprovacao>();
	static ArrayList<Aprovacao>listaReprovado = new ArrayList<Aprovacao>();
	public static void main(String[] args) {
		do {

		System.out.println("#####################################   ");
		System.out.println("###            Bem Vindo            ### ");
		System.out.println("### 1- Cadastro de Materias e Notas ### ");
		System.out.println("### 2- Exibir Todas as Materias     ### ");
		System.out.println("### 3- Exibir Materias Aprovadas    ### ");
		System.out.println("### 4- Exibir Materias Reprovadas   ### ");
		System.out.println("### 5- Exibir Maior e Menor Média   ### ");
		System.out.println("### 0- Sair do Menu                 ### ");
		System.out.println("#####################################   ");
		
		Scanner selecao = new Scanner(System.in);
		System.out.println("\nEscolha sua opção: ");
		opcao = selecao.nextInt();
		


		switch(opcao) {
		case 0:
			System.out.println("Obrigado por usar o programa!");
		}
		
		switch(opcao) {
		case 1:
			System.out.println("Cadastro de Materias e Notas!");
			
			CadastroMateria materia = new CadastroMateria(aNome, aAno);
			listaMaterias.add(materia);
			CadastroMateria.listaMateria(aNome, aAno);
			
			Aprovacao nota =new Aprovacao(aNp1, aNp2, aSub, aExame);
			listaNotas.add(nota);
			CadastroNotas.listarNotas(aNp1, aNp2, aSub, aExame);
			
			break;
		}
			
			switch(opcao) {
			case 2:
				System.out.println("Você escolheu ver a lista de Materias!");
				System.out.println("\nLista: "+listaMaterias);
				break;

			}
	

		

	}while(opcao!=0);
		System.out.println("Saindo");
		
		
	}
}

