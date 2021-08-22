package com.marcos.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "autor")
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nome;
	
	@Email
	@NotNull
	private String email;
	
	@NotNull
	@Size(max = 400)
	private String descricao;
	
	@NotNull
	private Instant dtCriacao;

	public Autor(@NotNull String nome, @Email @NotNull String email,
			@NotNull @Size(max = 400) String descricao, @NotNull Instant dtCriacao) {
		this.nome = nome;
		this.email = email;
		this.descricao = descricao;
		this.dtCriacao = dtCriacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Instant getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(Instant dtCriacao) {
		this.dtCriacao = dtCriacao;
	}
	
	
	
	
}
