package com.dio.live.Controllers;

import com.dio.live.Services.MovimentacaoService;
import com.dio.live.model.Movimentacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/Movimentacao")
public class MovimentacaoController {

    @Autowired
    MovimentacaoService Movimentacao;

    @PostMapping
    public Movimentacao createMovimentacao(@RequestBody Movimentacao Movimentacao){
        return this.Movimentacao.save(Movimentacao);
    }

    @GetMapping
    public List<Movimentacao> getMovimentacaoList(){
        return Movimentacao.findAll();
    }

    @GetMapping("/{idMovimentacao}")
    public ResponseEntity<Movimentacao> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(Movimentacao.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado")));
    }

    @PutMapping
    public Movimentacao updateMovimentacao(@RequestBody Movimentacao Movimentacao){
        return this.Movimentacao.update(Movimentacao);
    }

    @DeleteMapping("/{idMovimentacao}")
    public ResponseEntity<Movimentacao> deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        Movimentacao.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado"));//coloar httpstatus
        return (ResponseEntity<Movimentacao>) ResponseEntity.ok();
    }
}
