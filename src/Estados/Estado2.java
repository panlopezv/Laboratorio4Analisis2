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
public class Estado2 implements Estado {

    @Override
    public void cambiarEstado(MaquinaDulce m) {
        m.setEstado(2);
        System.out.println("Desplegando dulce.");
    }
    
}
