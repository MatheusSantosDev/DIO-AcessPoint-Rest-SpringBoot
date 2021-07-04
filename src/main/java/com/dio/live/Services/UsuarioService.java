package com.dio.live.Services;

import com.dio.live.Repositories.UsuarioRepository;
import com.dio.live.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository UsuarioRepository;


    public Usuario save(Usuario Usuario){
        return UsuarioRepository.save(Usuario);
    }

    public List<Usuario> findAll() {
       return UsuarioRepository.findAll();
    }

    public Optional<Usuario> getById(Long id) {
        return UsuarioRepository.findById(id);
    }

    public Usuario update(Usuario Usuario){
        return UsuarioRepository.save(Usuario);
    }

    public void deleteById(Long id) {
        UsuarioRepository.deleteById(id);
    }
}
