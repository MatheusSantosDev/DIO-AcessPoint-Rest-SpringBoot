package com.dio.live.Controllers;

import com.dio.live.Services.EmpresaService;
import com.dio.live.model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/Empresa")
public class EmpresaController {

    @Autowired
    EmpresaService Empresa;

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa Empresa){
        return this.Empresa.save(Empresa);
    }

    @GetMapping
    public List<Empresa> getEmpresaList(){
        return Empresa.findAll();
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(Empresa.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado")));
    }

    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa Empresa){
        return this.Empresa.update(Empresa);
    }

    @DeleteMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        Empresa.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Banco Horas Não Encontrado"));//coloar httpstatus
        return (ResponseEntity<Empresa>) ResponseEntity.ok();
    }
}
