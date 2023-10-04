package com.example.demo.servicios;

import com.example.demo.entities.Localidad;
import com.example.demo.repositorios.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServeceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    public LocalidadServeceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }

}

