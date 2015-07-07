/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

import java.util.ArrayList;

/**
 *
 * @author EST1629311
 */
public class MaquinaDulce {
    public int estado;
    public Boolean moneda;
    public ArrayList<Estado> estados;

    public MaquinaDulce(Boolean moneda) {
        this.moneda = moneda;
        this.estados = new ArrayList<>();
        this.estado=0;
    }
    
    public void agregarEstado(Estado e){
        this.estados.add(e);
    }
    
    public void procesar(){
        estados.get(estado).cambiarEstado(this);
    }
    
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Boolean getMoneda() {
        return moneda;
    }

    public void setMoneda(Boolean moneda) {
        this.moneda = moneda;
    }
    
    
}
