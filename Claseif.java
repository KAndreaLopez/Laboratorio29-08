
package lab29.pkg8;

/**
 *
 * @author Katherine Andrea López Muñoz
 * 5090-18-81
 */
public class Claseif {
   public Claseif(){
       //Constructor de nuestra clase
   } 
   
   Integer numero1=0, numero2=0;
   
   public void setIgual(int x, int y){
       this.numero1=x;
       this.numero2=y;
       
       if(numero1==numero2){
           System.out.println("Los numeros son iguales");
       }else{
           System.out.println("Los numeros son distintos");
       }   
   }
   
   public void setMayor(int x, int y){
       this.numero1=x;
       this.numero2=y;
       
       if(numero1>numero2){
           System.out.println("El numero 1 es mayor");
       }else{
           System.out.println("El numero 1 es menor");
       }
   }
   
   public void setMenor(int x, int y){
       this.numero1=x;
       this.numero2=y;
       
       if(numero1<numero2){
           System.out.println("El numero 1 es menor");
       }else{
           System.out.println("El numero 1 es mayor");
       }
   }
   
  public void setMaxi(int x, int y){
      this.numero1=x;
      this.numero2=y;
      
      
  }
  
  public void setMini(int x, int y){
      this.numero1=x;
      this.numero2=y;
      
      
  }
  
  public void setRaizCuadrada(int x, int y){
      this.numero1=x;
      this.numero2=y;
      
      
  }
  
  public void setFCuadratica(int x, int y){
      this.numero1=x;
      this.numero2=y;
      
      
  }
  
  public void setResta(int x, int y){
      this.numero1=x;
      this.numero2=y;
      
      int resta;
      resta=numero1-numero2;
      System.out.println("Su resultado es: "+resta);
  }
  
  public void setMultiplicacion(int x, int y){
      this.numero1=x;
      this.numero2=y;
      
      int mult;
      mult=numero1*numero2;
      System.out.println("Su resultado es: "+mult);
  }
  
  public void setDivision(int x, int y){
      this.numero1=x;
      this.numero2=y;
      
      int div;
      div=numero1/numero2;
      System.out.println("Su resultado es: "+div);
  }
  
  public void setAND(int x, int y){
      this.numero1=x;
      this.numero2=y;
      
      
  }
  
  public void setOR(int x, int y){
      this.numero1=x;
      this.numero2=y;
      
      
  }
  
  public void setNOT(int x, int y){
      this.numero1=x;
      this.numero2=y;
      
      
  }
  
}
