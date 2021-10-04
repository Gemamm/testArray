
package testarray;

import java.util.Scanner;
import testarray.*;
public class TestArray {

    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
      //Persona P1 [] = new Persona[3];
      Persona P1 []= {new Persona ("Gema"), new Persona ("Santi"), new Persona ("Maria")};
       
        /*P1 [0].setNombre("Gema");
        P1 [1].setNombre("Santi");
        P1 [2].setNombre("Maria");*/
        
        for (int i= 0; i < P1.length;i++){
            //P1[i] = new Persona();
            //System.out.println("Introduza nombre: ");
            //P1[i].setNombre(ent.nextLine());
            System.out.println("Mostrando nombre almacenado");
            System.out.println("Personas {"+ 1 + "} -> " 
                    + P1[i].getNombre());
        }
        
        
    }
    
}
