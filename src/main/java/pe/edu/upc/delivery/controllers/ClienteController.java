package pe.edu.upc.delivery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.upc.delivery.models.entities.Cliente;
import pe.edu.upc.delivery.models.entities.Distrito;
import pe.edu.upc.delivery.services.ClienteService;
import pe.edu.upc.delivery.services.DistritoService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private DistritoService distritoService;
	
	@GetMapping
	public String inicio(Model model) {
		Cliente cliente = new Cliente();
		
		try {
			List<Cliente> clientes = clienteService.findAll();
			List<Distrito> distritos = distritoService.findAll();
			model.addAttribute("clientes", clientes);
			model.addAttribute("cliente", cliente);
			model.addAttribute("distritos", distritos);
			
		} catch (Exception e) {
		
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		return "clientes/inicio";		
	}
	
	@PostMapping("save")
	public String save(@ModelAttribute("cliente") Cliente cliente) {
		
		try {
			clienteService.save(cliente);
		} catch (Exception e) {			
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		return "redirect:/clientes";
	}
	
	
	

}
