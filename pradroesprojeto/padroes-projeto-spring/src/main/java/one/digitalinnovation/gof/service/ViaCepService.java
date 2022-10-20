package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import one.digitalinnovation.gof.model.Endereco;



//CLIENT DO FEIGN
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
	
	
	//METODO QUE BUSCA BASIADO EM JSON (O FEIGN USA AS MESMAS ANOTAÇÕES DO SPRING)
	@GetMapping("/{cep}/json/" )
	Endereco consultarCep(@PathVariable("cep") String cep);
	

}
