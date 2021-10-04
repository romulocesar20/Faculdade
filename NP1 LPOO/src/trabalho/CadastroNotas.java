package trabalho;

import java.util.ArrayList;
import java.util.Scanner;
import trabalho.Aprovacao;
import trabalho.CadastroMateria;
import trabalho.Materia;
import trabalho.Notas;

public class CadastroNotas extends Aprovacao {
	static ArrayList<Aprovacao>listaNotas = new ArrayList<Aprovacao>();
	static ArrayList<String>listaMaterias = new ArrayList<String>();
	static ArrayList<Double>listaNotas1 = new ArrayList<Double>();
	static double maiorValor=0;
	static double menorValor=10;
	static double mediaTotal;
	

	public CadastroNotas(double aNp1, double aNp2, double aSub, double aExame) {
		super(aNp1, aNp2, aSub, aExame);
	}
	public static void listarNotas(double aNp1, double aNp2 , double aSub, double aExame ) {
		System.out.println("Cadastro de Notas!\n Nota NP1: ");
		Scanner cadastroNP1 = new Scanner(System.in);
		aNp1 = cadastroNP1.nextDouble();
		
		
		System.out.println("\n Nota NP2: ");
		Scanner cadastroNP2 = new Scanner(System.in);
		aNp2 = cadastroNP2.nextDouble();
		
		System.out.println("\n Nota Sub: ");
		Scanner cadastroSub = new Scanner(System.in);
		aSub = cadastroSub.nextDouble();
		
		System.out.println("\n Nota Exame: ");
		Scanner cadastroExame = new Scanner(System.in);
		aExame = cadastroExame.nextDouble();
		
		listaNotas1.add(getMedia());
		
		Aprovacao nota =new Aprovacao(aNp1, aNp2, aSub, aExame);
		
		listaNotas.add(nota);
		System.out.println(nota);
		calcularMedia();
		mediaTotal();
	}

	public static void maiorMedia(){
		for(int i=0; i < listaNotas.size(); i++ ){
			if(maiorValor < listaNotas1.get(i)) {
			}

	}
		System.out.println(maiorValor);
}
		
	public static void menorMedia() {
	
		for(int i=0; i < listaNotas.size(); i++ ) {
			if(menorValor > listaNotas1.get(i)) {
				Aprovacao menorValor;
				menorValor = listaNotas.get(i);
			}
			}
		System.out.println(menorValor);
	}
	public static void mediaTotal() {
		for(int i=0; i<listaNotas1.size(); i++) {
			mediaTotal =(mediaTotal+listaNotas1.get(i));
			
		}
		mediaTotal = mediaTotal/listaNotas1.size();
		}
}

	



