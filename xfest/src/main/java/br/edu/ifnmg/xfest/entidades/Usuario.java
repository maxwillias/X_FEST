package br.edu.ifnmg.xfest.entidades;

import java.util.Date;

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
@EqualsAndHashCode
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
    private Date date_creation;


    
}
