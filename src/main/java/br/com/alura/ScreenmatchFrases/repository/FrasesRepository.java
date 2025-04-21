package br.com.alura.Fraseflix.repository;

import br.com.alura.Fraseflix.model.Frases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FrasesRepository extends JpaRepository<Frases, Long> {

    @Query("SELECT f FROM Frases f order by function('RANDOM') LIMIT 1")
    Frases obterFraseAleatoria();

}
