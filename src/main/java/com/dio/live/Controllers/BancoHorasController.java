package com.dio.live.Controllers;

import com.dio.live.Services.BancoHorasService;
import com.dio.live.Services.JornadaService;
import com.dio.live.model.BancoHoras;
import com.dio.live.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/bancoHoras")
public class BancoHorasController {

    @Autowired
    BancoHorasService bancoHoras;

    @PostMapping
    public BancoHoras createBancoHoras(@RequestBody BancoHoras BancoHoras){
        return bancoHoras.save(BancoHoras);
    }

    @GetMapping
    public List<BancoHoras> getBancoHorasList(){
        return bancoHoras.findAll();
    }

    @GetMapping("/{idBancoHoras}")
    public ResponseEntity<BancoHoras> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(bancoHoras.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado")));
    }

    @PutMapping
    public BancoHoras updateBancoHoras(@RequestBody BancoHoras BancoHoras){
        return bancoHoras.update(BancoHoras);
    }

    @DeleteMapping("/{idBancoHoras}")
    public ResponseEntity<BancoHoras> deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        bancoHoras.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado"));//coloar httpstatus
        return (ResponseEntity<BancoHoras>) ResponseEntity.ok();
    }
}
