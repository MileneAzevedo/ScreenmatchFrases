package br.com.alura.Fraseflix.controller;

import br.com.alura.Fraseflix.dto.FrasesDTO;
import br.com.alura.Fraseflix.sevice.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class FrasesController {

    @Autowired
    private FrasesService servico;

    @GetMapping("/frases")
    public FrasesDTO obterFrases(){
        return servico.obterFrases();
    }


}
