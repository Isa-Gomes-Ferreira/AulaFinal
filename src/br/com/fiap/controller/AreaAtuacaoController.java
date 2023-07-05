package br.com.fiap.controller;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.dao.AreaAtuacaoDAO;
import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.AreaAtuacao;

public class AreaAtuacaoController {

	private AreaAtuacaoDAO areaAtuacaoDAO;

	public AreaAtuacaoController() {
		Connection connection = new ConnectionFactory().conectarOracle();
		this.areaAtuacaoDAO = new AreaAtuacaoDAO(connection);
	}

	public List<AreaAtuacao> findDAO() {
		return this.areaAtuacaoDAO.findCandidate();
	}

}
