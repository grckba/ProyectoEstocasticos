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
public class Agente {
    
    int numAlternativas = 2;
    Alternativa alternativa[] = new Alternativa[numAlternativas];
    
    public Agente(float gananciasA1[][], float gananciasA2[][]){
        
        alternativa[1]= new Alternativa(gananciasA1);
        alternativa[2]= new Alternativa(gananciasA2);
        
    }
    
}
