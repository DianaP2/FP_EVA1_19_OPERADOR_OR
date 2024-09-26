package eva1_19_operador_or;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */

public class EVA1_19_OPERADOR_OR {

    public static void main(String[] args) {
        int km,meses;
        
        Scanner captu=new Scanner(System.in);
        
        System.out.println("Ingresa Km");
        km=captu.nextInt();
        captu.nextLine();
        
        System.out.println("Captura los meses");
        meses=captu.nextInt();
        captu.nextLine();
        
        if(km >= 5000 || meses >= 6){
            
            System.out.println("Cambio de aceite");
        
        }else{
            
            System.out.println("Todo bien con el vehiculo");
        }
        
        
        
        
    }
    
}
