package br.edu.ifnmg.xfest.infraestrutura;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.edu.ifnmg.xfest.entidades.Usuario;
import br.edu.ifnmg.xfest.servicos.UsuarioRepositorio;

@Service
public class UsuarioDao extends DAO<Usuario> implements UsuarioRepositorio {

    public UsuarioDao() {
        super(Usuario.class);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Usuario Abrir(String login) {
        try {
            Query consulta = getManager()
            .createQuery("select u from Usuario u where u.login = :login");
            consulta.setParameter("login", login);
    
            return (Usuario) consulta.getSingleResult();
            } catch(Exception ex){
                System.out.println(ex.getMessage());
                return null;
            }
    }

    @Override
    @Transactional
    public List<Usuario> Buscar(Usuario filtro) {
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
    }
    
}
