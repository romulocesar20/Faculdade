package trabalho;

public class Notas {
   static private double np1;
   static private double np2;
   static private double sub;
    static  private double exam;
    

    
    public Notas(double aNp1, double aNp2, double aSub, double aExame){
    	this.np1 = aNp1;
    	this.np2 = aNp2;
    	this.sub = aSub;
    	this.exam = aExame;
        
    }
    
    public static double getNp1() {
        return np1;
    }

    public void setNp1(double np1) {
        this.np1 = np1;
    }

    public static double getNp2() {
        return np2;
    }

    public void setNp2(double np2) {
        this.np2 = np2;
    }

    public static double getSub() {
        return sub;
    }

    public void setSub(double sub) {
        this.sub = sub;
    }

    public static double getExam() {
        return exam;
    }

    public void setExam(double exam) {
        this.exam = exam;
    }
    
    @Override
    public String toString(){
        String res = "";
        res+= "Nota P1: " + this.getNp1() + "\n";
        res+= "Nota P2: " + this.getNp2() + "\n";
        res+= "Nota Substitutiva: " + this.getSub() + "\n";
        res+= "Nota Exame: " + this.getExam() + "\n";
        return res;
    }
}
