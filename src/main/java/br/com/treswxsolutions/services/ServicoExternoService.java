package br.com.treswxsolutions.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.treswxsolutions.domain.model.DadosForm;
import br.com.treswxsolutions.dto.RetornoApiDTO;

@Service
public  class ServicoExternoService {

    private static final String URI = "https://www.receitaws.com.br/v1/cnpj/27865757000102";

    public RetornoApiDTO chamarApiExterna(DadosForm form) {
        RestTemplate rest = new RestTemplate();
        ResponseEntity<RetornoApiDTO> retorno = rest.getForEntity(URI, RetornoApiDTO.class);
       return retorno.getBody();
    }
}

