package com.cliente.crud.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class RespuestaGenerica implements Serializable {

    private static final long serialVersionUID = 16767768878898987L;
    private int estatus;
    private String mensaje;
    private Map<String, Object> informacion;

    public RespuestaGenerica(int estatus, String mensaje, Map<String, Object> informacion) {
        this.estatus = estatus;
        this.mensaje = mensaje;
        this.setInformacion(informacion);
    }

    public RespuestaGenerica(int estatus, String mensaje) {
        this.estatus = estatus;
        this.mensaje = mensaje;
    }

    public RespuestaGenerica(int estatus, String mensaje, String llave, Object valor) {
        this.estatus = estatus;
        this.mensaje = mensaje;
        this.informacion = new HashMap<>();
        this.informacion.put(llave, valor);
    }
}