/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estados;

import laboratorio4.Estado;
import laboratorio4.MaquinaDulce;

/**
 *
 * @author EST1629311
 */
public class EstadoF implements Estado {

    @Override
    public void cambiarEstado(MaquinaDulce m) {
        m.setMoneda(Boolean.FALSE);
        m.setEstado(0);
        System.out.println("Dulce entregado.");
    }
    
}
