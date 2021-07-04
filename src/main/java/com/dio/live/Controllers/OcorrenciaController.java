package com.dio.live.Controllers;

import com.dio.live.Services.OcorrenciaService;
import com.dio.live.model.Ocorrencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/Ocorrencia")
public class OcorrenciaController {

    @Autowired
    OcorrenciaService Ocorrencia;

    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia Ocorrencia){
        return this.Ocorrencia.save(Ocorrencia);
    }

    @GetMapping
    public List<Ocorrencia> getOcorrenciaList(){
        return Ocorrencia.findAll();
    }

    @GetMapping("/{idOcorrencia}")
    public ResponseEntity<Ocorrencia> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(Ocorrencia.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado")));
    }

    @PutMapping
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia Ocorrencia){
        return this.Ocorrencia.update(Ocorrencia);
    }

    @DeleteMapping("/{idOcorrencia}")
    public ResponseEntity<Ocorrencia> deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        Ocorrencia.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado"));//coloar httpstatus
        return (ResponseEntity<Ocorrencia>) ResponseEntity.ok();
    }
}
