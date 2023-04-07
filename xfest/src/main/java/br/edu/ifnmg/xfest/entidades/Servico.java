package br.edu.ifnmg.xfest.entidades;

import javax.persistence.*;

@Entity
@Table(name = "servico")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "nome_servico")
    private String nome;

    @Column(name = "ValorServico")
    private float valorServico;
    
    @Column(name = "TelServico", length = 14, nullable = false)
    private String telServico;
    
    @Column(name = "Descricao_Servico")
    private String descricao;
    
    @Enumerated(EnumType.ORDINAL)
    private TipoServicos tipoServico;
    
    @Column(name = "EmailServico", length = 500, nullable = false)
    private String emailServico;
    
    @ManyToOne
    private Usuario fk_Usuario;
    
    public long getId() {
        return Id;
    }
    public Servico() {
        this.nome = "";
        this.valorServico = 0f;
        this.telServico = "";
        this.descricao = "";
        this.tipoServico = null;
        this.emailServico = "";
        this.fk_Usuario = null;
    }

    public Servico(String nome, float valorServico, String telServico, String descricao, TipoServicos tipoServico,
            String emailServico, Usuario fk_Usuario) {
        this.nome = nome;
        this.valorServico = valorServico;
        this.telServico = telServico;
        this.descricao = descricao;
        this.tipoServico = tipoServico;
        this.emailServico = emailServico;
        this.fk_Usuario = fk_Usuario;
    }

    public float getValorServico() {
        return valorServico;
    }

    public String getTelServico() {
        return telServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoServicos getTipoServico() {
        return tipoServico;
    }

    public String getEmailServico() {
        return emailServico;
    }

    public Usuario getFk_Usuario() {
        return fk_Usuario;
    }

    public void setValorServico(float valorServico) {
        this.valorServico = valorServico;
    }

    public void setTelServico(String telServico) {
        this.telServico = telServico;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipoServico(TipoServicos tipoServico) {
        this.tipoServico = tipoServico;
    }

    public void setEmailServico(String emailServico) {
        this.emailServico = emailServico;
    }

    public void setFk_Usuario(Usuario fk_Usuario) {
        this.fk_Usuario = fk_Usuario;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (Id ^ (Id >>> 32));
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + Float.floatToIntBits(valorServico);
        result = prime * result + ((telServico == null) ? 0 : telServico.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((tipoServico == null) ? 0 : tipoServico.hashCode());
        result = prime * result + ((emailServico == null) ? 0 : emailServico.hashCode());
        result = prime * result + ((fk_Usuario == null) ? 0 : fk_Usuario.hashCode());
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
        Servico other = (Servico) obj;
        if (Id != other.Id)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (Float.floatToIntBits(valorServico) != Float.floatToIntBits(other.valorServico))
            return false;
        if (telServico == null) {
            if (other.telServico != null)
                return false;
        } else if (!telServico.equals(other.telServico))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (tipoServico != other.tipoServico)
            return false;
        if (emailServico == null) {
            if (other.emailServico != null)
                return false;
        } else if (!emailServico.equals(other.emailServico))
            return false;
        if (fk_Usuario == null) {
            if (other.fk_Usuario != null)
                return false;
        } else if (!fk_Usuario.equals(other.fk_Usuario))
            return false;
        return true;
    }


    

    


    
}
