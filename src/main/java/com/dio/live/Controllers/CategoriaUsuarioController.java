package com.dio.live.Controllers;

import com.dio.live.Services.CategoriaUsuarioService;
import com.dio.live.model.CategoriaUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/CategoriaUsuario")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService CategoriaUsuario;

    @PostMapping
    public CategoriaUsuario createCategoriaUsuario(@RequestBody CategoriaUsuario CategoriaUsuario){
        return this.CategoriaUsuario.save(CategoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> getCategoriaUsuarioList(){
        return CategoriaUsuario.findAll();
    }

    @GetMapping("/{idCategoriaUsuario}")
    public ResponseEntity<CategoriaUsuario> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(CategoriaUsuario.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado")));
    }

    @PutMapping
    public CategoriaUsuario updateCategoriaUsuario(@RequestBody CategoriaUsuario CategoriaUsuario){
        return this.CategoriaUsuario.update(CategoriaUsuario);
    }

    @DeleteMapping("/{idCategoriaUsuario}")
    public ResponseEntity<CategoriaUsuario> deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        CategoriaUsuario.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado"));//coloar httpstatus
        return (ResponseEntity<CategoriaUsuario>) ResponseEntity.ok();
    }
}
