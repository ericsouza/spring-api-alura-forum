package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;

import br.com.alura.forum.model.Topico;

public class TopicDto {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	public TopicDto(Topico topic) {
		this.id = topic.getId();
		this.titulo = topic.getTitulo();
		this.mensagem = topic.getMensagem();
		this.dataCriacao = topic.getDataCriacao();
		
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

	public static Page<TopicDto> converter(Page<Topico> topics) {
		return topics.map(TopicDto::new);
	}
	
	

}
