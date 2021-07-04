package com.dio.live.Services;

import com.dio.live.Repositories.OcorrenciaRepository;
import com.dio.live.model.Ocorrencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {

    @Autowired
    OcorrenciaRepository OcorrenciaRepository;


    public Ocorrencia save(Ocorrencia Ocorrencia){
        return OcorrenciaRepository.save(Ocorrencia);
    }

    public List<Ocorrencia> findAll() {
       return OcorrenciaRepository.findAll();
    }

    public Optional<Ocorrencia> getById(Long id) {
        return OcorrenciaRepository.findById(id);
    }

    public Ocorrencia update(Ocorrencia Ocorrencia){
        return OcorrenciaRepository.save(Ocorrencia);
    }

    public void deleteById(Long id) {
        OcorrenciaRepository.deleteById(id);
    }
}
