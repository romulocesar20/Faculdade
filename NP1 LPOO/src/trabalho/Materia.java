package trabalho;



public class Materia {
    private String nome;
    private int ano;

    
    
    public Materia(String aNome, int aAno) {
    	this.nome = aNome;
    	this.ano = aAno;
    	
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    @Override
    public String toString(){
        String res = "";
        res+= "Matéria: " + this.getNome() + "\n";
        res+= "Ano: " + this.getAno() + "\n";
        return res;
    }
    
}
