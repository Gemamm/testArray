/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarray;

/**
 *
 * @author Alumno Mañana
 */
public class TestMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int edades [][] = new int [3][2];
        edades [0][0] = 1;
        edades [0][1] = 7;
        edades [1][0] = 4;
        edades [1][1] = 6;
        edades [2][0] = 5;
        edades [2][1] = 9;
        imprimir(edades);
        /*System.out.println("edades = " + edades);
        
        for (int i= 0; i < edades.length;i++){
            for (int j= 0; j < edades[i].length;j++){
                System.out.println("edades [" +i+ "]["+ j +"]"+ edades[i][j]);
            }
        }*/
        
        
    }
    
    public static void imprimir(int matriz [][]){
        
         for (int i= 0; i < matriz.length;i++){
            for (int j= 0; j < matriz[i].length;j++){
                System.out.println("edades [" +i+ "]["+ j +"]"+ matriz[i][j]);
        
    }
    
}
    }
}
