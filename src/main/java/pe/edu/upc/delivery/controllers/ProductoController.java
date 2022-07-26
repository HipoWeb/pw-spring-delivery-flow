package pe.edu.upc.delivery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import pe.edu.upc.delivery.models.entities.Producto;
import pe.edu.upc.delivery.services.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@PostMapping("search")
	public String search(@ModelAttribute("producto")Producto producto, Model model) {
		model.addAttribute("producto", producto);
		
		try {
			List<Producto> productos = productoService.findByDescripcion(producto.getDescripcion());
			model.addAttribute("productos", productos);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return "productos/result-search";
	}

		
}
