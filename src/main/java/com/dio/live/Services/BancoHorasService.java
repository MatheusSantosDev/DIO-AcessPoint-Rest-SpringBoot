package com.dio.live.Services;

import com.dio.live.Repositories.BancoHorasRepository;
import com.dio.live.Repositories.JornadaRepository;
import com.dio.live.model.BancoHoras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {

    @Autowired
    BancoHorasRepository bancoHorasRepository;


    public BancoHoras save(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public List<BancoHoras> findAll() {
       return bancoHorasRepository.findAll();
    }

    public Optional<BancoHoras> getById(Long id) {
        return bancoHorasRepository.findById(id);
    }

    public BancoHoras update(BancoHoras BancoHoras){
        return bancoHorasRepository.save(BancoHoras);
    }

    public void deleteById(Long id) {
        bancoHorasRepository.deleteById(id);
    }
}
