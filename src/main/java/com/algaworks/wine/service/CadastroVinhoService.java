package com.algaworks.wine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.algaworks.wine.model.Vinho;
import com.algaworks.wine.repository.VinhosRepository;
import com.algaworks.wine.storage.FotoStorage;

@Service
public class CadastroVinhoService {

	@Autowired
	private VinhosRepository vinhoRepository;

	@Autowired
	private FotoStorage fotoStorage;

	public void salvar(Vinho vinho) {
		this.vinhoRepository.save(vinho);
	}

	public String salvarFoto(Long codigo, MultipartFile foto) {

		String nomeFoto = fotoStorage.salvar(foto);

		Vinho vinho = vinhoRepository.findOne(codigo);
		vinho.setFoto(nomeFoto);
		vinhoRepository.save(vinho);

		return fotoStorage.getUrl(nomeFoto);

	}

}
