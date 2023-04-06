package br.edu.ifnmg.xfest.servicos;

import br.edu.ifnmg.xfest.entidades.Usuario;

public interface UsuarioRepositorio extends Repositorio<Usuario>{
    public Usuario Abrir(String login);
}
