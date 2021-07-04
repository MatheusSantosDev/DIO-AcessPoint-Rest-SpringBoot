package com.dio.live.Controllers;

import com.dio.live.Services.CalendarioService;
import com.dio.live.model.Calendario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/Calendario")
public class CalendarioController {

    @Autowired
    CalendarioService Calendario;

    @PostMapping
    public Calendario createCalendario(@RequestBody Calendario Calendario){
        return this.Calendario.save(Calendario);
    }

    @GetMapping
    public List<Calendario> getCalendarioList(){
        return Calendario.findAll();
    }

    @GetMapping("/{idCalendario}")
    public ResponseEntity<Calendario> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(Calendario.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado")));
    }

    @PutMapping
    public Calendario updateCalendario(@RequestBody Calendario Calendario){
        return this.Calendario.update(Calendario);
    }

    @DeleteMapping("/{idCalendario}")
    public ResponseEntity<Calendario> deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        Calendario.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado"));//coloar httpstatus
        return (ResponseEntity<Calendario>) ResponseEntity.ok();
    }
}
