package br.com.treswxsolutions.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DadosForm {
	
	@JsonProperty("cnpj")
    private String cnpj;
	
	@JsonProperty("nome")
	private String nome;
    //getter e setters
		
	@JsonProperty("telefone")
    private String situacao;
	

    
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
    

	

}