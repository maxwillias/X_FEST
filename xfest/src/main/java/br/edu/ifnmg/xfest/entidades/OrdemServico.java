package br.edu.ifnmg.xfest.entidades;

import javax.persistence.*;

@Entity
@Table(name = "ordem_servicos")
public class OrdemServico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome", length = 500, nullable = false)
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "tamanho_evento")
    private String tamanhoEvento;

    @Column(name = "numero_contato")
    private String numeroContato;

    @ManyToOne
    private Usuario usuario;

    public OrdemServico() {
    }

    public OrdemServico(long id, String nome, String descricao, String tamanhoEvento, String numeroContato,
            Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.tamanhoEvento = tamanhoEvento;
        this.numeroContato = numeroContato;
        this.usuario = usuario;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTamanhoEvento(String tamanhoEvento) {
        this.tamanhoEvento = tamanhoEvento;
    }

    public void setNumeroContato(String numeroContato) {
        this.numeroContato = numeroContato;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTamanhoEvento() {
        return tamanhoEvento;
    }

    public String getNumeroContato() {
        return numeroContato;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((tamanhoEvento == null) ? 0 : tamanhoEvento.hashCode());
        result = prime * result + ((numeroContato == null) ? 0 : numeroContato.hashCode());
        result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrdemServico other = (OrdemServico) obj;
        if (id != other.id)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (tamanhoEvento == null) {
            if (other.tamanhoEvento != null)
                return false;
        } else if (!tamanhoEvento.equals(other.tamanhoEvento))
            return false;
        if (numeroContato == null) {
            if (other.numeroContato != null)
                return false;
        } else if (!numeroContato.equals(other.numeroContato))
            return false;
        if (usuario == null) {
            if (other.usuario != null)
                return false;
        } else if (!usuario.equals(other.usuario))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OrdemServico Id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", tamanhoEvento="
                + tamanhoEvento + ", numeroContato=" + numeroContato + ", usuario=" + usuario + "]";
    }
}

    
