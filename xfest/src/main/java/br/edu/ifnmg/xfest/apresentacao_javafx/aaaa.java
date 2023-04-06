package br.edu.ifnmg.xfest.apresentacao_javafx;

//import javax.persistence.EntityManager;
//import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


import br.edu.ifnmg.xfest.entidades.Usuario;
import br.edu.ifnmg.xfest.servicos.UsuarioRepositorio;

@EntityScan("br.edu.ifnmg.xfest")
@ComponentScan("br.edu.ifnmg.xfest")
@SpringBootApplication
public class aaaa
		implements CommandLineRunner {

	@Autowired
	UsuarioRepositorio usuarios;

	public static void main(String[] args) {
		SpringApplication.run(aaaa.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Cria um objeto da entidade Usuario
		Usuario u = new Usuario();
		u.setLogin("will");
		u.setPassword("123");

		usuarios.Salvar(u);

	}

}
