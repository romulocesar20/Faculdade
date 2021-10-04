package trabalho;

public class TesteAprovacao {
	public static void main(String[] args) {
		Aprovacao relatorio = new Aprovacao(7.0, 7.0, 0, 0);
		relatorio.calcularMedia();
		System.out.println(relatorio);
		
	}

}
