package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import br.com.alura.forum.model.StatusTopico;
import br.com.alura.forum.model.Topico;

public class TopicDetailsDto {
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeAutor;
	private StatusTopico status;
	private List<AnswerDto> respostas;
	
	public TopicDetailsDto(Topico topic) {
		this.id = topic.getId();
		this.titulo = topic.getTitulo();
		this.mensagem = topic.getMensagem();
		this.dataCriacao = topic.getDataCriacao();
		this.nomeAutor = topic.getAutor().getNome();
		this.status = topic.getStatus();
		this.respostas = new ArrayList<>();
		this.respostas.addAll(topic.getRespostas().stream().map(AnswerDto::new).collect(Collectors.toList()));
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public StatusTopico getStatus() {
		return status;
	}

	public List<AnswerDto> getRespostas() {
		return respostas;
	}
}
