package br.com.jonatasferreira.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jonatasferreira.myinvest.domain.Investimento;

@Repository
public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {

}
