package br.com.jmccursos.tecnologia.mudijesse.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.jmccursos.tecnologia.mudijesse.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Smartphone LG K22+");
		pedido.setUrlDaImagem("https://images-na.ssl-images-amazon.com/images/I/71toL165IzL._AC_SL1500_.jpg");
		pedido.setUrlDoProduto("https://www.amazon.com.br/Smartphone-LG-Mem%C3%B3ria-armazenamento-Android/dp/B08DRMM17M/"+
				 "ref=sr_1_5?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=celular&qid=1621525615&sr=8-5");
		pedido.setDescricao("Smartphone LG K22+ , 3GB Memória, 64GB armazenamento, Dual Chip Android 10 Tela 6.2\" Quad Core 4G Câmera 13MP+2MP - Titan");
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos",pedidos);
		return "home";
	}

}
