package com.algaworks.wine.dto;

public class Foto {

	private String url;

	public Foto(String nome) {
		this.url = nome;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
