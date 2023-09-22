package com.cliente.crud.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "clientes")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    @Getter
    @Setter
    private Integer idCliente;

    @Column(name = "nombre_cliente")
    @Getter
    @Setter
    private String nombreCliente;

    @Column(name = "apellido_cliente")
    @Getter
    @Setter
    private String apellidoCliente;

    @Column(name = "email")
    @Getter
    @Setter
    private String email;

    @Column(name = "edad")
    @Getter
    @Setter
    private Integer edad;

    @Column(name = "fecha_registro")
    @Getter
    @Setter
    private Date fechaRegistro;

}
