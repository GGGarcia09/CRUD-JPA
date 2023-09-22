

package com.cliente.crud.dto;


public enum EstatusResponse {


    OK(1, 1, "Código de esatus correcto"),

    ERROR(1, 0, "Código de esatus error");


    private EstatusResponse(int id, int estatus, String descripcion) {
        this.id = id;
        this.estatus = estatus;
        this.descripcion = descripcion;
    }


    public static EstatusResponse valueOf(int id) {
        for (EstatusResponse EstatusResponse : values()) {
            if (EstatusResponse.getId() == id) {
                return EstatusResponse;
            }
        }
        throw new IllegalArgumentException("Id '" + id + "' inválido para obtener enum EstatusResponse");
    }

    private int id;
    private int estatus;
    private String descripcion;


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getEstatus() {
        return estatus;
    }


    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
