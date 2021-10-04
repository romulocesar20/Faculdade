package APS;

public class Curso {
    private String nomeCurso;
    private String nivel;
    private String ano;
    
    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
        @Override
    public String toString(){
        String res = "";
        res+= "Curso: " + this.getNomeCurso() + "\n";
        res+= "Nível: " + this.getNivel() + "\n";
        res+= "Iniciou em: " + this.getAno() + "\n";
        return res;
    }
}
