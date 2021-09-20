package br.com.treswxsolutions.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treswxsolutions.domain.model.DadosForm;
import br.com.treswxsolutions.dto.RetornoApiDTO;
import br.com.treswxsolutions.services.ServicoExternoService;



@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private ServicoExternoService service;


	@GetMapping
    public RetornoApiDTO exemplo(DadosForm form) {
        RetornoApiDTO retorno = service.chamarApiExterna(form);
        return retorno;
        
    }
}