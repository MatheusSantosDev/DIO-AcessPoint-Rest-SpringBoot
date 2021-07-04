package com.dio.live.Services;

import com.dio.live.Repositories.MovimentacaoRepository;
import com.dio.live.model.Movimentacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

    @Autowired
    MovimentacaoRepository MovimentacaoRepository;


    public Movimentacao save(Movimentacao Movimentacao){
        return MovimentacaoRepository.save(Movimentacao);
    }

    public List<Movimentacao> findAll() {
       return MovimentacaoRepository.findAll();
    }

    public Optional<Movimentacao> getById(Long id) {
        return MovimentacaoRepository.findById(id);
    }

    public Movimentacao update(Movimentacao Movimentacao){
        return MovimentacaoRepository.save(Movimentacao);
    }

    public void deleteById(Long id) {
        MovimentacaoRepository.deleteById(id);
    }
}
