package br.com.alura.Fraseflix.sevice;

import br.com.alura.Fraseflix.dto.FrasesDTO;
import br.com.alura.Fraseflix.model.Frases;
import br.com.alura.Fraseflix.repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FrasesService {

    @Autowired
    private FrasesRepository repositorio;

    public FrasesDTO obterFrases() {
        Frases frase = repositorio.obterFraseAleatoria();
        return new FrasesDTO(
                frase.getFrase(),
                frase.getPersonagem(),
                frase.getTitulo(),
                frase.getPoster()
        );


    }
}
