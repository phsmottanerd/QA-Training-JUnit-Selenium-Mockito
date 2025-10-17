package com.qa.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class PessoaTeste {

    @Test
    void validaVerificacaoDeMaioridade() {
        Pessoa joaozinho = new Pessoa("João", LocalDate.of(2004, 1, 1));
        assertTrue(joaozinho.ehMaiorDeIdade());
    }

    @Test
    void validaMenorDeIdade() {
        Pessoa crianca = new Pessoa("Maria", LocalDate.of(2010, 1, 1));
        assertFalse(crianca.ehMaiorDeIdade());
    }
}