package com.dio.live.Controllers;

import com.dio.live.Services.UsuarioService;
import com.dio.live.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {

    @Autowired
    UsuarioService Usuario;

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario Usuario){
        return this.Usuario.save(Usuario);
    }

    @GetMapping
    public List<Usuario> getUsuarioList(){
        return Usuario.findAll();
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Usuario> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(Usuario.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado")));
    }

    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario Usuario){
        return this.Usuario.update(Usuario);
    }

    @DeleteMapping("/{idUsuario}")
    public ResponseEntity<Usuario> deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        Usuario.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado"));//coloar httpstatus
        return (ResponseEntity<Usuario>) ResponseEntity.ok();
    }
}
