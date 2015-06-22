/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoestocasticos;

/**
 *
 * @author Grace
 */
public class Beneficio {
    
    int[][] matriz;
    
    public Beneficio (){
        matriz = new int[2][2];
        for (int i=0; i>1; i++){
            for (int j=0; j>1; j++){
                matriz[i][j] = (int) (Math.random()*100);
            }
        }
    }
    
}
