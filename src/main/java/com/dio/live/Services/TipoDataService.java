package com.dio.live.Services;

import com.dio.live.Repositories.TipoDataRepository;
import com.dio.live.model.TipoData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {

    @Autowired
    TipoDataRepository TipoDataRepository;


    public TipoData save(TipoData TipoData){
        return TipoDataRepository.save(TipoData);
    }

    public List<TipoData> findAll() {
       return TipoDataRepository.findAll();
    }

    public Optional<TipoData> getById(Long id) {
        return TipoDataRepository.findById(id);
    }

    public TipoData update(TipoData TipoData){
        return TipoDataRepository.save(TipoData);
    }

    public void deleteById(Long id) {
        TipoDataRepository.deleteById(id);
    }
}
