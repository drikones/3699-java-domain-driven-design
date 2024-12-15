package br.com.alura.codechella.aplicacao.evento;

import br.com.alura.codechella.domain.evento.Endereco;
import br.com.alura.codechella.domain.evento.Evento;

import java.util.List;

public interface RepositorioDeEvento {
    Evento buscarEventosPorCidade(Endereco endereco);
}
