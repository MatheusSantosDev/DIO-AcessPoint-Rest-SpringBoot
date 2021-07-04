package com.dio.live.Controllers;

import com.dio.live.Services.LocalidadeService;
import com.dio.live.model.Localidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/Localidade")
public class LocalidadeController {

    @Autowired
    LocalidadeService Localidade;

    @PostMapping
    public Localidade createLocalidade(@RequestBody Localidade Localidade){
        return this.Localidade.save(Localidade);
    }

    @GetMapping
    public List<Localidade> getLocalidadeList(){
        return Localidade.findAll();
    }

    @GetMapping("/{idLocalidade}")
    public ResponseEntity<Localidade> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(Localidade.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado")));
    }

    @PutMapping
    public Localidade updateLocalidade(@RequestBody Localidade Localidade){
        return this.Localidade.update(Localidade);
    }

    @DeleteMapping("/{idLocalidade}")
    public ResponseEntity<Localidade> deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        Localidade.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado"));//coloar httpstatus
        return (ResponseEntity<Localidade>) ResponseEntity.ok();
    }
}
