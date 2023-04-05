package br.edu.ifnmg.xfest.infraestrutura;

import java.util.List;

import br.edu.ifnmg.xfest.servicos.Repositorio;

public class DAO<T>  implements Repositorio<T>{

    @Override
    public T Abrir(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Abrir'");
    }

    @Override
    public boolean Salvar(T obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Salvar'");
    }

    @Override
    public boolean Apagar(T obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Apagar'");
    }

    @Override
    public List<T> Buscar(T filtro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Buscar'");
    }
    
}
