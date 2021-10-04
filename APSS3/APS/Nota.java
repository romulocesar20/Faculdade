package APS;

public class Nota {
    private double np1;
    private double np2;
    private double sub;
    private double exam;
    private double media;
    
    public double getNp1() {
        return np1;
    }

    public void setNp1(double np1) {
        this.np1 = np1;
    }

    public double getNp2() {
        return np2;
    }

    public void setNp2(double np2) {
        this.np2 = np2;
    }

    public double getSub() {
        return sub;
    }

    public void setSub(double sub) {
        this.sub = sub;
    }

    public double getExam() {
        return exam;
    }

    public void setExam(double exam) {
        this.exam = exam;
    }
    
    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    public void calcularMedia(){
        if(getSub() > getNp1()){
            media = (getSub()+getNp2())/2;
        }
        else if(getSub() > getNp2()){
            media = (getNp1()+getSub())/2;
        }
        else{
            media = (getNp1()+getNp2())/2;
        }
        
        if(media >= 7){
            System.out.println("Aprovado");
        }
        else{
            media = (media + getExam())/2;
            if(media >= 5){
                System.out.println("Aprovado");
            }
            else{
                System.out.println("Reprovado");
            }
        }
        
    }
    
    @Override
    public String toString(){
        String res = "";
        res+= "Média Final: " + this.getMedia() + "\n";
        return res;
    }
}
