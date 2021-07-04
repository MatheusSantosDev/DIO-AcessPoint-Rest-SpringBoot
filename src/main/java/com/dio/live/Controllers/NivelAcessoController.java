package com.dio.live.Controllers;

import com.dio.live.Services.NivelAcessoService;
import com.dio.live.model.NivelAcesso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/NivelAcesso")
public class NivelAcessoController {

    @Autowired
    NivelAcessoService NivelAcesso;

    @PostMapping
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso NivelAcesso){
        return this.NivelAcesso.save(NivelAcesso);
    }

    @GetMapping
    public List<NivelAcesso> getNivelAcessoList(){
        return NivelAcesso.findAll();
    }

    @GetMapping("/{idNivelAcesso}")
    public ResponseEntity<NivelAcesso> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(NivelAcesso.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado")));
    }

    @PutMapping
    public NivelAcesso updateNivelAcesso(@RequestBody NivelAcesso NivelAcesso){
        return this.NivelAcesso.update(NivelAcesso);
    }

    @DeleteMapping("/{idNivelAcesso}")
    public ResponseEntity<NivelAcesso> deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        NivelAcesso.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado"));//coloar httpstatus
        return (ResponseEntity<NivelAcesso>) ResponseEntity.ok();
    }
}
