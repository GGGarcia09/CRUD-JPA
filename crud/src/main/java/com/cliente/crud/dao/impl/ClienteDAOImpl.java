package com.cliente.crud.dao.impl;

import com.cliente.crud.dao.ClienteDAO;
import com.cliente.crud.model.ClienteEntity;
import com.cliente.crud.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteDAOImpl implements ClienteDAO {

    @Autowired
    ClienteRepository repository;

    @Override
    public List<ClienteEntity> obtenerClientes() {
        List<ClienteEntity> clientes = (List<ClienteEntity>) repository.findAll();
        return clientes;
    }

    @Override
    public Optional<ClienteEntity> obtenerClientesById(Integer idCliente) {
        Optional<ClienteEntity> cliente = repository.findById(idCliente);
        return cliente;
    }

    @Override
    public ClienteEntity registarCliente(ClienteEntity entity) {
        ClienteEntity cliente = repository.save(entity);
        return cliente;
    }

    @Override
    public String eliminarCliente(Integer idCliente) {
         try {
             Optional<ClienteEntity> cliente = repository.findById(idCliente);
             if(cliente.isPresent()){
                repository.delete(cliente.get());
             }else{
                 throw new Exception("cliente no encontrado con Id: " + idCliente);
             }
         } catch (Exception e){
             return "Error " + e.getMessage();
         }
        return "Eliminado de cliente con id: " + idCliente;
    }
}
