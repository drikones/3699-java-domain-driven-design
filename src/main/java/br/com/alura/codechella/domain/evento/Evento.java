package br.com.alura.codechella.domain.evento;

import br.com.alura.codechella.domain.ingresso.TipoIngresso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private Categoria categoria;
    private String descricao;
    private LocalDateTime data;
    private Endereco endereco;
    private List<TipoIngresso> tiposIngresso = new ArrayList<>();


    public void incluiNovoTipoDeIngressoAoEvento(TipoIngresso tipoIngresso) {
        tiposIngresso.add(tipoIngresso);
    }

    public void aumentaNumeroDeIngressosPorTipo() {
        //implementar aqui
    }


    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<TipoIngresso> getTiposIngresso() {
        return tiposIngresso;
    }
}
