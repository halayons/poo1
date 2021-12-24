public class Proyecto {
    int pTiempo;
    double pCapital;
    double pInteres;
 

 public double calcularInteresSimple(){
    double interesSimple = Math.round(this.pCapital * (this.pInteres/100) * this.pTiempo);
     return interesSimple;
    

    // Ecuación 1 – Calculo interés siempre
     }
     public double calcularInteresCompuesto(){
         double interesCompuesto= Math.round(this.pCapital*(Math. pow((1+(this.pInteres/100)),this.pTiempo)-1));

         return interesCompuesto;
        
    // Ecuación 2 – Calculo interés compuesto
     }
    
     public double cotejarInversion (int pTiempo, double pCapital, double pInteres ){
         this.pTiempo=pTiempo;
         this.pCapital=pCapital;
         this.pInteres=pInteres;
        double cotejarInversion = calcularInteresCompuesto()-calcularInteresSimple() ;
        return cotejarInversion;
    // Ecuación 3 – Diferencia de comparar los intereses totales según los tipos de interés
    }
    
    public static void main(String[] args) throws Exception {
        Proyecto sd = new Proyecto();
        //double a=sd.cotejarInversion( 5,  1650000,  8 );
        double a=sd.cotejarInversion( 10,  2650000,  2.5 );
        System.out.println(a);
    }
}
