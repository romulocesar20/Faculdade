package APS;

public class Aluno {
    private String nomeAluno;
    
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
    @Override
    public String toString(){
        String res = "";
        res+= "Aluno: " + this.getNomeAluno() + "\n";
        return res;
    }
}
