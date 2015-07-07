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
public class EstadoI implements Estado{

    @Override
    public void cambiarEstado(MaquinaDulce m) {
        if(m.getMoneda()==true){
            m.setEstado(1);
            System.out.println("Moneda recibida");
        }
        else{
            System.out.println("Ingrese una moneda para continuar.");
        }
    }
    
}
