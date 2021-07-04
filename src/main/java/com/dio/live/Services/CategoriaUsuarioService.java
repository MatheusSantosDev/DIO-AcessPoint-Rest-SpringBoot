package com.dio.live.Services;

import com.dio.live.Repositories.CategoriaUsuarioRepository;
import com.dio.live.model.CategoriaUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {

    @Autowired
    CategoriaUsuarioRepository CategoriaUsuarioRepository;


    public CategoriaUsuario save(CategoriaUsuario CategoriaUsuario){
        return CategoriaUsuarioRepository.save(CategoriaUsuario);
    }

    public List<CategoriaUsuario> findAll() {
       return CategoriaUsuarioRepository.findAll();
    }

    public Optional<CategoriaUsuario> getById(Long id) {
        return CategoriaUsuarioRepository.findById(id);
    }

    public CategoriaUsuario update(CategoriaUsuario CategoriaUsuario){
        return CategoriaUsuarioRepository.save(CategoriaUsuario);
    }

    public void deleteById(Long id) {
        CategoriaUsuarioRepository.deleteById(id);
    }
}
