package br.edu.ifnmg.xfest.infraestrutura;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import br.edu.ifnmg.xfest.entidades.Servicos;
import br.edu.ifnmg.xfest.servicos.ServicosRepositorio;

public class ServicosDAO extends DAO<Servicos> implements ServicosRepositorio {

    public ServicosDAO(Class<Servicos> classe) {
        super(classe);
        //TODO Auto-generated constructor stub
    }

    /* @Override
    public Servicos Abrir(String login) {
        try {
            Query consulta = getManager()
            .createQuery("select u from Servicos u where u.login = :login");
            consulta.setParameter("login", login);
    
            return (Servicos) consulta.getSingleResult();
            } catch(Exception ex){
                System.out.println(ex.getMessage());
                return null;
            }
    } */

    /* @Override
    @Transactional
    public List<Servicos> Buscar(Servicos filtro) {
        try {
            String jpql = "select u from Usuario u";
            
            if(!filtro.getLogin().isEmpty()){
                jpql += " where u.login like :login and u.password like :password";
            }
            Query consulta = getManager().createQuery(jpql);
            if(!filtro.getLogin().isEmpty()){
                consulta.setParameter("login", filtro.getLogin());
                consulta.setParameter("password", filtro.getPassword());
            }
            return consulta.getResultList();
        } catch(Exception ex){
            return null;
        }
    } */
    
}
