package trabalho;

import java.util.ArrayList;
import java.util.Scanner;
import trabalho.Materia;
import trabalho.CadastroMateria;
import trabalho.CadastroNotas;
import trabalho.Aprovacao;
import trabalho.Notas;

public class TesteCadastro {
	static int escolha =-1;
	static String aNome;
	static int aAno;
	static double aNp1;
	static double aNp2;
	static double aSub;
	static double aExame;
	static int opcao;


	
	static ArrayList<String>listaMaterias = new ArrayList<String>();
	static ArrayList<Aprovacao>listaNotas = new ArrayList<Aprovacao>();
	static ArrayList<String>listaAprovados = new ArrayList<String>();
	static ArrayList<String>listaReprovados = new ArrayList<String>();
	static ArrayList<Double>listaNotas1 = new ArrayList<Double>();
	

	
	
	
	public static void main(String[] args) {
		while(escolha!=0) {


				System.out.println("###            Bem Vindo                     ### ");
				System.out.println("### 1- Cadastro de Materias e Notas          ### ");
				System.out.println("### 2- Exibir Todas as Materias              ### ");
				System.out.println("### 3- Exibir Materias Aprovadas             ### ");
				System.out.println("### 4- Exibir Materias Reprovadas            ### ");
				System.out.println("### 5- Exibir Maior e Menor Média            ### ");
				System.out.println("### 6- Exibir Media Total                    ###");
				System.out.println("### 7- Exibir Materias de Determinado Ano    ###");
				System.out.println("### 0- Sair do Menu                          ### ");
	
				System.out.println("\n\nEscolha sua opcao:");
				
		Scanner menu = new Scanner(System.in);
		escolha = menu.nextInt();
		
		
			switch(escolha) {
			case 0:
				System.out.println("Obrigado por usar o programa!");
				break;
			}
			
			switch(escolha) {
			case 1:
				System.out.println("\nCadastro de Materias e Notas!");
			
				CadastroMateria materia = new CadastroMateria(aNome, aAno);
				CadastroMateria.listaMateria(aNome, aAno);
				listaMaterias.add(aNome);
			
				Aprovacao nota =new Aprovacao(aNp1, aNp2, aSub, aExame);
				listaNotas.add(nota);
				CadastroNotas.listarNotas(aNp1, aNp2, aSub, aExame);
				break;	
			}
			
		switch(escolha) {
		case 2:
			System.out.println("Lista com todas as materias!\n");
			System.out.println(CadastroMateria.listaMaterias);
			break;
						}
		switch(escolha) {
		case 3:
			System.out.println("Lista com as Materias Aprovadas!\n");
			System.out.println(CadastroMateria.listaAprovados);
			break;
		}
		switch(escolha) {
		case 4:
			System.out.println("Lista com as Materias Reprovadas!\n");
			System.out.println(CadastroMateria.listaReprovados);
			break;
		}
		switch(escolha) {
		case 5:

			System.out.println("Mostrar a Maior Media e a Menor Media!\n");
			CadastroNotas.maiorMedia();
			CadastroNotas.menorMedia();
			break;
		}
		switch(escolha) {
		case 6:
			System.out.println("Mostrar Media Total!");
			System.out.println(CadastroNotas.mediaTotal);
			break;
		}
		switch(escolha) {
		case 7:
			System.out.println("Materia de determinado Ano");
			CadastroMateria.anoMateria();
			break;
		}

	}


	}


}