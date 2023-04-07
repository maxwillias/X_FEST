package br.edu.ifnmg.xfest.infraestrutura;

import org.springframework.stereotype.Service;

import br.edu.ifnmg.xfest.entidades.OrdemServico;
import br.edu.ifnmg.xfest.servicos.OrdemServicoRepositorio;

@Service
public class OrdemServicoDAO extends DAO<OrdemServico> implements OrdemServicoRepositorio{

    public OrdemServicoDAO() {
        super(OrdemServico.class);
    }
    
}
