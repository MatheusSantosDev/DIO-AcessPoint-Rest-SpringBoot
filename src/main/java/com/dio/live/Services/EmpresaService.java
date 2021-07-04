package com.dio.live.Services;

import com.dio.live.Repositories.EmpresaRepository;
import com.dio.live.model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository EmpresaRepository;


    public Empresa save(Empresa Empresa){
        return EmpresaRepository.save(Empresa);
    }

    public List<Empresa> findAll() {
       return EmpresaRepository.findAll();
    }

    public Optional<Empresa> getById(Long id) {
        return EmpresaRepository.findById(id);
    }

    public Empresa update(Empresa Empresa){
        return EmpresaRepository.save(Empresa);
    }

    public void deleteById(Long id) {
        EmpresaRepository.deleteById(id);
    }
}
