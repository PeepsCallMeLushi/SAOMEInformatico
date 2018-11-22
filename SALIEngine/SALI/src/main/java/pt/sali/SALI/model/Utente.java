package pt.sali.SALI.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class Utente {
	
	@Id
	private String id;
	private String sexo;
	private Idade idade;
	private Avaliacao avaliacao;
	private Atuacao atuacao;
	private String observacao;
	private ArrayList<String> hipotesesDiagnostivas;
	
	public Utente(String sexo, Idade idade, Avaliacao avaliacao, Atuacao atuacao, String observacao,
			ArrayList<String> hipotesesDiagnostivas) {
		super();
		this.id = null;
		this.sexo = sexo;
		this.idade = idade;
		this.avaliacao = avaliacao;
		this.atuacao = atuacao;
		this.observacao = observacao;
		this.hipotesesDiagnostivas = hipotesesDiagnostivas;
	}

	public Utente() {
		super();
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Idade getIdade() {
		return idade;
	}

	public void setIdade(Idade idade) {
		this.idade = idade;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Atuacao getAtuacao() {
		return atuacao;
	}

	public void setAtuacao(Atuacao atuacao) {
		this.atuacao = atuacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public ArrayList<String> getHipotesesDiagnostivas() {
		return hipotesesDiagnostivas;
	}

	public void setHipotesesDiagnostivas(ArrayList<String> hipotesesDiagnostivas) {
		this.hipotesesDiagnostivas = hipotesesDiagnostivas;
	}

	public String getId() {
		return id;
	}
	
}
