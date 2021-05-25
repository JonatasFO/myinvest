package br.com.jonatasferreira.myinvest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonatasferreira.myinvest.domain.Categoria;
import br.com.jonatasferreira.myinvest.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> listarTodos() {
		return categoriaRepository.findAll();
	}

	@GetMapping("/{codigo}")
	public Categoria buscarPeloCodigo(@PathVariable Long codigo) {
		return categoriaRepository.findById(codigo).orElse(null);
	}

	@DeleteMapping("/{codigo}")
	public void remover(@PathVariable Long codigo) {
		categoriaRepository.deleteById(codigo);
	}

	@PostMapping
	public Categoria cadastrar(@RequestBody Categoria investimento) {
		return categoriaRepository.save(investimento);
	}

}
