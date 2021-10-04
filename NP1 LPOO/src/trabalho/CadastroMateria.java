	package trabalho;

import java.util.ArrayList;
import trabalho.Aprovacao;
import java.util.Scanner;
import trabalho.CadastroNotas;
import trabalho.Materia;
import trabalho.Notas;

public class CadastroMateria extends Materia {
	
	static ArrayList<String>listaAprovados = new ArrayList<String>();
	static ArrayList<String>listaReprovados = new ArrayList<String>();
	static ArrayList<Materia>listaMaterias = new ArrayList<Materia>();
	static ArrayList<Integer>listaAno = new ArrayList<Integer>();
	static ArrayList<String>listanomeMateria = new ArrayList<String>();
	static String aNome;
	static int aAno;
	static int ano;
	
	public CadastroMateria(String aNome, int aAno) {
		super(aNome, aAno);
	}
	
	public static void listaMateria(String aNome, int aAno) {
		System.out.println("Cadastro de Materia!\nNome da Materia: ");
		Scanner cadastroMateria = new Scanner(System.in);
		aNome = cadastroMateria.next();
		
		System.out.println("Ano: ");
		Scanner cadastroAno = new Scanner(System.in);
		aAno = cadastroAno.nextInt();
		
		listaAno.add(aAno);
		listanomeMateria.add(aNome);
		
		CadastroMateria materia = new CadastroMateria(aNome, aAno);
		listaMaterias.add(materia);
		System.out.println(materia);
	

		

		if(CadastroNotas.getMedia() >= 5) {
			CadastroMateria.listaAprovados.add(CadastroMateria.aNome);
		}
		else if(CadastroNotas.getMedia() < 5) {
			CadastroMateria.listaReprovados.add(CadastroMateria.aNome);
				
		}
			
	}

	
	
	
	public static void anoMateria() {
		System.out.println("Escolha um ano:");
		Scanner listarAno = new Scanner(System.in);
		ano = listarAno.nextInt();
		
		for(int i= 0; i < listaMaterias.size(); i++) {
			if(ano == listaAno.get(i)) {
				System.out.println(listaMaterias.get(i));	
			}
			
		}
	}
}
	


	

