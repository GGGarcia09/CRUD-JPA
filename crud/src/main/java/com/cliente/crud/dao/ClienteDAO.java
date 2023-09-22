package com.cliente.crud.dao;

import com.cliente.crud.model.ClienteEntity;

import java.util.List;
import java.util.Optional;

public interface ClienteDAO {

   List<ClienteEntity> obtenerClientes ();

   Optional<ClienteEntity> obtenerClientesById (Integer idCliente);

   ClienteEntity registarCliente (ClienteEntity cliente);

   String eliminarCliente (Integer idCliente);

}
