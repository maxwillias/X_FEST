package br.edu.ifnmg.xfest.entidades;

import java.util.Date;
import java.util.Objects;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor 
@NoArgsConstructor
@ToString
@Entity
@Table(name="usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "login", length = 500, nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date_creation = new Date();

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) obj;
        return Objects.equals(login, other.login) && Objects.equals(password, other.password);
}

    
}
