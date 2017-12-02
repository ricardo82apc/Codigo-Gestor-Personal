
package calculos;


public class Imponible implements Parametros{
    
   
   int dt,sb,he;

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }
   
   

    public Imponible(int dt, int he, int sb) {   
        this.dt = dt;
        this.he = he;
        this.sb = sb;
        
    }

    
   
   public int vdiastrabajados(){
       return (sb/30)*dt;
   }
   
   public int gratificacion(){  
       return(int)(((imm*4.75)/12)/30)*dt;
   }
   
    public int vhorasextras(){
        
        return(int)(sb*he*fhe);
    }
    
    public int sumaImponible(){
        
        return this.vhorasextras() + this.gratificacion() + this.vdiastrabajados();
    }
}
    
    

