package com.example.Distribuidor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Distribuidor.dto.Empresa;
import com.example.Distribuidor.dao.IEmpresaDAO;

@RestController
@RequestMapping(path="/empresa")
public class MainController {

    @Autowired
    private IEmpresaDAO iEmpresaDAO;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Empresa> getAllEmpresas() {
      return iEmpresaDAO.findAll();
    }  // Fn de public getAllEmpresas
  

}  // Fin de public class MainController




