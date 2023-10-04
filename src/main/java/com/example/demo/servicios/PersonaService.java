package com.example.demo.servicios;

import com.example.demo.entities.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long>{
    List<Persona> serach(String filtro) throws Exception;


}

















