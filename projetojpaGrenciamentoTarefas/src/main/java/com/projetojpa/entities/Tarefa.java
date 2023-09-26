package com.projetojpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name= "Tarefa")
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@NotBlank
	private String nome;

	
	@NotBlank
	private String dataLimiteExecucao;

	
	@NotBlank
    private String detalhesTarefa;


	@NotBlank
	private String statusTarefa;


	public Long getId(){
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataLimiteExecucao() {
		return dataLimiteExecucao;

	}

	public void setDataLimiteExecucao(String DataLimiteExecucao) {
		this.dataLimiteExecucao = DataLimiteExecucao;
	}
	public String getDetalhesTarefa() {
		return detalhesTarefa;
	}
	public void setDetalhesTarefa(String detalhesTarefa) {
		this.detalhesTarefa = detalhesTarefa;

	}
	public String getStatusTarefa() {
		return statusTarefa;
	}
	public void setStatus(String statusTarefa) {
		this.statusTarefa = statusTarefa;

}
}
