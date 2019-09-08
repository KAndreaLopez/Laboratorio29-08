
package lab28.pkg9;

/**
 *
 * @author Katherine Andrea López Muñoz
 * 5090-18-81
 */
public class mainClass {
    
    public static void main(String[] args) {
       Claseif condicional = new Claseif(); 
       int opcion=0;
        
        System.out.println("\t---- BIENVENIDO ----\n");
        
        System.out.println("¿Que desea realizar?");
        System.out.println("1.IGUALDAD");
        System.out.println("2.NUMERO MAYOR");
        System.out.println("3.NUMERO MENOR");
        System.out.println("4.MAXIMO Y MINIMO");
        System.out.println("5.RAIZ CUADRADA");
        System.out.println("6.ECUACION CUADRATICA");
        System.out.println("7.RESTA");
        System.out.println("8.MULTIPLICACION");
        System.out.println("9.DIVISION");
        System.out.println("10.CONECTOR AND");
        System.out.println("11.CONECTOR OR");
        System.out.println("12.CONECTOR NOT");
        System.out.println("Opcion a elegir:");
        Scanner sc= new Scanner(System.in);
        opcion=sc.nextInt();
        
        
        switch(opcion){
            
            case 1:
                System.out.println("\n");
                condicional.setIgual(10, 5);
            break;
                
            case 2:
                System.out.println("\n");
                condicional.setMayor(25,10);
            break;
                
            case 3:
                System.out.println("\n");
                condicional.setMenor(6,10);
            break;
                
            case 4:
                System.out.println("\n");
                condicional.setMaxiyMini();
            break;
                
            case 5:
                System.out.println("\n");
                condicional.setRaizCuadrada(25);
            break;
            
            case 6:
                System.out.println("\n");
                condicional.setFCuadratica(40, 12, 9);
            break;
                
            case 7:
                System.out.println("\n");
                condicional.setResta(5, 2);
            break;
                
            case 8:
                System.out.println("\n");
                condicional.setMultiplicacion(15, 5);
            break;
                
            case 9:
                System.out.println("\n");
                condicional.setDivision(20, 4);
            break;
            
            case 10:
                System.out.println("\n");
                condicional.setAND(13, 6);
            break;
                
            case 11:
                System.out.println("\n");
                condicional.setOR(12, 5);
            break;
                
            case 12:
                System.out.println("\n");
                condicional.setNOT(2, 4);
            break;
                
        }
           
         
    }
       
        
    }
    
}
