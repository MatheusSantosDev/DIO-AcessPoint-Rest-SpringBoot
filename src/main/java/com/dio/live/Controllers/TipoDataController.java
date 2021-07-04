package com.dio.live.Controllers;

import com.dio.live.Services.TipoDataService;
import com.dio.live.model.TipoData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/TipoData")
public class TipoDataController {

    @Autowired
    TipoDataService TipoData;

    @PostMapping
    public TipoData createTipoData(@RequestBody TipoData TipoData){
        return this.TipoData.save(TipoData);
    }

    @GetMapping
    public List<TipoData> getTipoDataList(){
        return TipoData.findAll();
    }

    @GetMapping("/{idTipoData}")
    public ResponseEntity<TipoData> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(TipoData.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado")));
    }

    @PutMapping
    public TipoData updateTipoData(@RequestBody TipoData TipoData){
        return this.TipoData.update(TipoData);
    }

    @DeleteMapping("/{idTipoData}")
    public ResponseEntity<TipoData> deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        TipoData.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado"));//coloar httpstatus
        return (ResponseEntity<TipoData>) ResponseEntity.ok();
    }
}
