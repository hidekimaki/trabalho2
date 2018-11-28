package br.edu.utfpr.md.restapi.dao;


import br.edu.utfpr.md.restapi.model.Pessoa;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class PessoaDAO extends GenericDAO<Integer, Pessoa> {

    public PessoaDAO() {
        super();
    }
}