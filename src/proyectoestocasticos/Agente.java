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
    
    Beneficio beneficioPropio;  // Matriz con beneficios para cada escenario
    int estrategia;             // 0 para moderada, 1 para agresiva
    
    public Agente(){
        beneficioPropio = new Beneficio();
    }
    
}
