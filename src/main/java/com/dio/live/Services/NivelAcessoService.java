package com.dio.live.Services;

import com.dio.live.Repositories.NivelAcessoRepository;
import com.dio.live.model.NivelAcesso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {

    @Autowired
    NivelAcessoRepository NivelAcessoRepository;


    public NivelAcesso save(NivelAcesso NivelAcesso){
        return NivelAcessoRepository.save(NivelAcesso);
    }

    public List<NivelAcesso> findAll() {
       return NivelAcessoRepository.findAll();
    }

    public Optional<NivelAcesso> getById(Long id) {
        return NivelAcessoRepository.findById(id);
    }

    public NivelAcesso update(NivelAcesso NivelAcesso){
        return NivelAcessoRepository.save(NivelAcesso);
    }

    public void deleteById(Long id) {
        NivelAcessoRepository.deleteById(id);
    }
}
