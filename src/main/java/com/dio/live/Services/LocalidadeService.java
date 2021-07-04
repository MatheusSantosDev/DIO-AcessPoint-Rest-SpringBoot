package com.dio.live.Services;

import com.dio.live.Repositories.LocalidadeRepository;
import com.dio.live.model.Localidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {

    @Autowired
    LocalidadeRepository LocalidadeRepository;


    public Localidade save(Localidade Localidade){
        return LocalidadeRepository.save(Localidade);
    }

    public List<Localidade> findAll() {
       return LocalidadeRepository.findAll();
    }

    public Optional<Localidade> getById(Long id) {
        return LocalidadeRepository.findById(id);
    }

    public Localidade update(Localidade Localidade){
        return LocalidadeRepository.save(Localidade);
    }

    public void deleteById(Long id) {
        LocalidadeRepository.deleteById(id);
    }
}
