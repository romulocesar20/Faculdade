package trabalho;



public class Aprovacao extends Notas{
    static private double media;
   
  
    
    public static double getMedia() {
        return media;
    }
    
  
    
    public void setMedia(double media) {
        this.media = media;
    }
    
    public Aprovacao( double aNp1, double aNp2, double aSub, double aExame){
        super(aNp1, aNp2, aSub, aExame);
        
        
    }
    
    public static void calcularMedia(){
        if(getNp1() > getSub() && getNp2() > getSub()){
            media = (getNp1()+getNp2())/2;
        }
        else if(getNp1() > getNp2() && getSub() > getNp2()){
            media = (getNp1()+getSub())/2;
        }
        else{
            media = (getSub()+getNp2())/2;
        }
        
        if(media >= 7){
            System.out.println("Média final: " + getMedia());
        }
        else if(media > getExam()){
            System.out.println("Média final: " + getMedia());
        }
        else{
            System.out.println("Média final: " + getExam());
        }
        if(media >= 5) {
        	System.out.println("Você foi aprovado!");
     
        	
        }
        else {
        	System.out.println("Você foi reprovado!");
  
        }
        
  
        
        
    }
    
  


}

