package com.dio.live.Services;

import com.dio.live.Repositories.BancoHorasRepository;
import com.dio.live.Repositories.CalendarioRepository;
import com.dio.live.model.BancoHoras;
import com.dio.live.model.Calendario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {

    @Autowired
    CalendarioRepository calendarioRepository;


    public Calendario save(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    public List<Calendario> findAll() {
       return calendarioRepository.findAll();
    }

    public Optional<Calendario> getById(Long id) {
        return calendarioRepository.findById(id);
    }

    public Calendario update(Calendario Calendario){
        return calendarioRepository.save(Calendario);
    }

    public void deleteById(Long id) {
        calendarioRepository.deleteById(id);
    }
}
