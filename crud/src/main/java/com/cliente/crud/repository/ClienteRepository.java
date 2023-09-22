package com.cliente.crud.repository;

import com.cliente.crud.model.ClienteEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository <ClienteEntity, Integer> {


}
