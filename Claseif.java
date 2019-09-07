
package lab28.pkg9;

/**
 *
 * @author Katherine Andrea López Muñoz
 * 5090-18-81
 */
public class Claseif {
    public Claseif(){
       //Constructor de nuestra clase
   } 
   
   Integer numero1=0, numero2=0, numero3=0;
   Integer list[]={10,6,20,3,2};
   
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
   
  public void setMaxiyMini(){
      int min, max;
      min=max=list[0];
      
      for(int i=0; i<list.length; i++){
          if(min>list[i]){
              min=list[i];
          }
          if(max<list[i]){
              max=list[i];
          }
      }
      System.out.println("El número máximo es: "+max);
      System.out.println("El número minimo es: "+min);
  }
  
  public void setRaizCuadrada(int x){
      this.numero1=x;
      float raiz=(float) Math.sqrt(numero1);
      
      System.out.println("La raiz cuadrada de "+x+" es: "+raiz);
      
  }
  
  public void setFCuadratica(int a, int b, int c){
      this.numero1=a;
      this.numero2=b;
      this.numero3=c;
      
      double potencia, x1, x2;
      
      potencia=Math.pow(b, 2)-(4*a*c);
      
      x1=(-b-Math.sqrt(potencia)/2*a);
      x2=(-b+Math.sqrt(potencia)/2*a);
      
      System.out.println("El valor de x1 es: "+x1);
      System.out.println("El valor de x2 es: "+x2);
  }
  
  public void setResta(int x, int y){
      this.numero1=x;
      this.numero2=y;
      int resta=0;
       
        if(numero1 < numero2) {
            throw new ArithmeticException("Valores incorrectos - El numero 1 debe ser mayor que numero 2");
        }else {
            resta=numero1-numero2;
            System.out.println("Resultado de la resta es: "+resta);
        }
  }
  
  public void setMultiplicacion(int x, int y){
      this.numero1=x;
      this.numero2=y;
      
      int mult;
      mult=numero1*numero2;
      System.out.println("Resultado de la multiplicacion es: "+mult);
  }
  
  public void setDivision(int x, int y){
      this.numero1=x;
      this.numero2=y;
      int div=0;
       
        if(numero1 < numero2) {
            throw new ArithmeticException("Valores incorrectos - El numero 1 debe ser mayor que numero 2");
        }else {
            div=numero1-numero2;
            System.out.println("Resultado de la division es: "+div);
        }
  }
  
  public void setAND(int x, int y){
      this.numero1=x;
      this.numero2=y;
      
        if(x == 4 && y == 2) {

            System.out.println("TRUE");
        }else{
            System.out.println("FALSE"+" QUE TE VAYA BIEN");
        }
      
  }
  
  public void setOR(int x, int y){
      this.numero1=x;
      this.numero2=y;
      
       if(x == 12 ||  y == 4) {

            System.out.println("TRUE");
        }else {
            System.out.println("FALSE"+" NO EXISTE NINGUNA COINCIDENCIA");
        }
  }
  
  public void setNOT(int x, int y){
      this.numero1=x;
      this.numero2=y;
      
      if(x != y){
        System.out.println("EL NUMERO 1 ES DIFERENTE DEL NUMERO 2");
     }else{
        System.out.println("EL NUMERO 1 ES IGUAL QUE EL NUMERO 2");
     }
    
 }
    
  
}
