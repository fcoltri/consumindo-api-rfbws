package br.com.treswxsolutions.dto;

public class RetornoApiDTO {

    private String cnpj;
    private String nome;
    private String situacao;
    //getter e setters
    
    
	public String getCnpj() {
		return cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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

