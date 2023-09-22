
package com.cliente.crud.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class RespuestaGenerica implements Serializable {

    private static final long serialVersionUID = 16767768878898987L;
    private int estatus;
    private String mensaje;
    private Map<String, Object> informacion;


    public RespuestaGenerica() {
        setInformacion(new HashMap<String, Object>());
    }

    /**
     * Constructor
     * @author
     * @param estatus
     * @param mensaje
     * @param informacion
     */
    public RespuestaGenerica(int estatus, String mensaje, Map<String, Object> informacion) {
        this.estatus = estatus;
        this.mensaje = mensaje;
        this.setInformacion(informacion);
    }

    /**
     * Constructor
     * @author
     * @param estatus
     * @param mensaje
     */
    public RespuestaGenerica(int estatus, String mensaje) {
        this.estatus = estatus;
        this.mensaje = mensaje;
    }

    /**
     * Constructor
     * @author
     * @param estatus
     * @param mensaje
     * @param llave
     * @param valor
     */
    public RespuestaGenerica(int estatus, String mensaje, String llave, Object valor) {
        this.estatus = estatus;
        this.mensaje = mensaje;
        this.getInformacion().put(llave, valor);
    }




    public int getEstatus() {
        return estatus;
    }


    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }


    public String getMensaje() {
        return mensaje;
    }


    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }


    public Map<String, Object> getInformacion() {
    	if(null == informacion){
    		informacion = new HashMap<String,Object>();
    	}
        return informacion;
    }


    public void setInformacion(Map<String, Object> informacion) {
        this.informacion = informacion;
    }

}
