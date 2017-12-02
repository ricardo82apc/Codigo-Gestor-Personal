
package calculos;

public class NoImponible implements Parametros{
    int imponible,movilizacion=50000,colacion=50000,dt;
    
    public NoImponible(int imponible, int dt){
        this.imponible =imponible;
        this.dt=dt;
    }
    
    public int gratificacion(){
        int valor;
        
        if (imponible ==0)
            valor=0;
        else if (imponible <170000)
            valor=6500;
        else if (imponible <293624)
            valor=4830;
        else if (imponible <457954)
            valor=1526;
        else
            valor=0;
        return valor;
    }
    
    public int movilizacion(){
       return (movilizacion/30)*dt;
    }
    public int colacion(){
       return (colacion/30)*dt;
    }
    public int sumanoImponible(){
        return this.movilizacion() + this.colacion() + this.gratificacion();
    }
}
