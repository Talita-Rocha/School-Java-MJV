package oldClass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oldClass.cadastro.Customer;

@RestController 
@RequestMapping("/customers") 

public class CustomerController {
	@Autowired 
	//private CustomerRepository repository;
	
	@PostMapping 
	public void gravar(@RequestBody Customer customer) {
		//repository.save(customer);
	}
	@GetMapping 
	//public List<Customer> listar() {
		//return repository.findAll();
	//}
	@PutMapping 
	public void alterar(@RequestBody Customer customer) {
		//repository.save(customer);
	}
	@DeleteMapping ("/{id}") 
	public void excluir(@PathVariable ("id") Integer id) {
		//repository.deleteById(id);
	} 
}

//@RestController define a classe como um Controller para o Rest.
//@RequestMapping("/customers") para mapear o endpoint específico para uma função ou método.
//@Autowired fornece controle sobre onde e como a ligação entre os beans deve ser realizada. 
//@RequestBody ajuda a mapear automaticamente o corpo da solicitação para o parâmetro. Principalmente, JSON para POJO.
//POST - SALVAR
//PUT - ALTERAR
//GET - BUSCAR - LISTAR
//DELETE - EXCLUSAO



