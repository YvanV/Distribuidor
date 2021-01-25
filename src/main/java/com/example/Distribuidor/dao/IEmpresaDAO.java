package com.example.Distribuidor.dao;

import com.example.Distribuidor.dto.Empresa;

import org.springframework.data.repository.CrudRepository;

public interface IEmpresaDAO extends CrudRepository<Empresa, Integer> {
    
} // Fin de public interface IEmpresaDAO
