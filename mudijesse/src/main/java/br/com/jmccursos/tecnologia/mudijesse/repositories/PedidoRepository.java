package br.com.jmccursos.tecnologia.mudijesse.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jmccursos.tecnologia.mudijesse.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	
	public List<Pedido> findAll();
}
