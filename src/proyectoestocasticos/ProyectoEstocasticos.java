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
public class ProyectoEstocasticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agente empresa1, empresa2, empresa3;
        
        float gananciasA11[][], gananciasA12[][];
        float gananciasA21[][], gananciasA22[][];
        float gananciasA31[][], gananciasA32[][];
        
        gananciasA11 = new float[2][2];
        gananciasA12 = new float[2][2];
        gananciasA21 = new float[2][2];
        gananciasA22 = new float[2][2];
        gananciasA31 = new float[2][2];
        gananciasA32 = new float[2][2];
        
        for (int i=0; i>1; i++){
            for (int j=0; j>1; j++){
                gananciasA11[i][j] = (int) (Math.random()*100);
                gananciasA12[i][j] = (int) (Math.random()*100);
                gananciasA21[i][j] = (int) (Math.random()*100);
                gananciasA22[i][j] = (int) (Math.random()*100);
                gananciasA31[i][j] = (int) (Math.random()*100);
                gananciasA32[i][j] = (int) (Math.random()*100);
            }
        }
        
        empresa1 = new Agente(gananciasA11, gananciasA12);
        empresa2 = new Agente(gananciasA21, gananciasA22);
        empresa3 = new Agente(gananciasA31, gananciasA32);        
        
    }
    
}
