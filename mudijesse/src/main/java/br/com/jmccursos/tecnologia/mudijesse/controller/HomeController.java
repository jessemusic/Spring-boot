package br.com.jmccursos.tecnologia.mudijesse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.jmccursos.tecnologia.mudijesse.model.Pedido;
import br.com.jmccursos.tecnologia.mudijesse.repositories.PedidoRepository;

@Controller
public class HomeController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("/home")
	public String home(Model model) {	
				List<Pedido> pedidos = pedidoRepository.findAll();
		model.addAttribute("pedidos",pedidos);
		return "home";
	}

}
