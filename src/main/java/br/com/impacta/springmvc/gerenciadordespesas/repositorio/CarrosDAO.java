package br.com.impacta.springmvc.gerenciadordespesas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.impacta.springmvc.gerenciadordespesas.model.Carros;

public interface CarrosDAO extends JpaRepository<Carros, Integer> {
	
	

}