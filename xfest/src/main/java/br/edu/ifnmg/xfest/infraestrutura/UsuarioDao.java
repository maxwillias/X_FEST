package br.edu.ifnmg.xfest.infraestrutura;

import javax.persistence.Query;

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
    
}
