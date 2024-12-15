package br.com.alura.codechella.infraestrutura.ingresso;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoRepository extends JpaRepository<Tipo, Long> {
}
