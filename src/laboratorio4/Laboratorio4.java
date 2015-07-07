/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

import Estados.Estado2;
import Estados.EstadoF;
import Estados.EstadoI;
import java.util.ArrayList;

/**
 *
 * @author EST1629311
 */
public class Laboratorio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estado e1 = new EstadoI();
        Estado e2 = new Estado2();
        Estado e3 = new EstadoF();
        MaquinaDulce md=new MaquinaDulce(Boolean.FALSE);
        md.agregarEstado(e1);
        md.agregarEstado(e2);
        md.agregarEstado(e3);
        md.procesar();
        md.procesar();
        md.setMoneda(Boolean.TRUE);
        md.procesar();
        md.procesar();
        md.procesar();
        
    }
    
}
