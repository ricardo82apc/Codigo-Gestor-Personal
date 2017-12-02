
package calculos;

public class Descuentos implements Parametros{
    double valorafp, valorisapre,imponible;
   
    public Descuentos(double imponible, double valorafp, double valorisapre) {
        this.imponible = imponible;
        this.valorafp = valorafp;
        this.valorisapre = valorisapre;
    }

   public int afp(){
       return (int)(imponible * valorafp);
   }
   
   public int isapre(){
       return (int)(imponible * valorisapre);
    }
   
   public int sumadescuento(){
       return this.afp()+ this.isapre();
   }

}
