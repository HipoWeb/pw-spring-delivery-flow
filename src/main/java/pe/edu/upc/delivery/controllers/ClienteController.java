package pe.edu.upc.delivery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.upc.delivery.models.entities.Cliente;
import pe.edu.upc.delivery.services.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public String inicio(Model model) {
		try {
			List<Cliente> clientes = clienteService.findAll();
			model.addAttribute("clientes", clientes);
			
		} catch (Exception e) {
		
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "clientes/inicio";		
	}
	
	
	

}
