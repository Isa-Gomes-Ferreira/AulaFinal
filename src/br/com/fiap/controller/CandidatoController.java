package br.com.fiap.controller;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.dao.CandidatoDAO;
import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Candidato;

public class CandidatoController {

	private CandidatoDAO candidatoDAO;

	public CandidatoController(CandidatoDAO candidatoDAO) {
		Connection connection = new ConnectionFactory().conectarOracle();
		this.candidatoDAO = new CandidatoDAO(connection);
	}

	public void delete(Integer IdCandidato) {
		this.candidatoDAO.delete(IdCandidato);
	}

	public void insert(Candidato candidato) {
		this.candidatoDAO.insert(candidato);
	}

	public List<Candidato> findAll() {
		return this.candidatoDAO.findAll();
	}

	public void update(Candidato candidato) {
		this.candidatoDAO.update(candidato);
	}

}
