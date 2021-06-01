package br.com.jmccursos.tecnologia.mudijesse.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.jmccursos.tecnologia.mudijesse.model.Pedido;
import br.com.jmccursos.tecnologia.mudijesse.model.StatusPedido;
import br.com.jmccursos.tecnologia.mudijesse.repositories.PedidoRepository;

@Controller
@RequestMapping("usuario")
public class UsuaroController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("pedido")
	public String home(Model model, Principal principal) {	
		List<Pedido> pedidos = pedidoRepository.findAllByUsuario(principal.getName());
		model.addAttribute("pedidos",pedidos);
		return "usuario/home";
	}
	
	@GetMapping("pedido/{status}")
	public String aguardando(@PathVariable("status") String status, Model model, Principal principal) {	
		List<Pedido> pedidos = pedidoRepository.findByStatusAndUsers(StatusPedido.valueOf(status.toUpperCase()),principal.getName());
		model.addAttribute("pedidos",pedidos);
		model.addAttribute("status", status);
		return "usuario/home";
	}
	@ExceptionHandler(IllegalArgumentException.class)
	public String OnError() {
		return "redirect:/usuario/home";
	}


}
