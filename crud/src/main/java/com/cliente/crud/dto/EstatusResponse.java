package com.cliente.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum EstatusResponse {


    OK(1, 1, "Código de esatus correcto"),

    ERROR(1, 0, "Código de esatus error");


    private int id;
    private int estatus;
    private String descripcion;


    public static EstatusResponse valueOf(int id) {
        for (EstatusResponse EstatusResponse : values()) {
            if (EstatusResponse.getId() == id) {
                return EstatusResponse;
            }
        }
        throw new IllegalArgumentException("Id '" + id + "' inválido para obtener enum EstatusResponse");
    }

}