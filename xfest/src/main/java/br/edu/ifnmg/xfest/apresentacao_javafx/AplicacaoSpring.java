package br.edu.ifnmg.xfest.apresentacao_javafx;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


import javafx.application.Application;

@EntityScan("br.edu.ifnmg.xfest")
@ComponentScan("br.edu.ifnmg.xfest")
@SpringBootApplication
public class AplicacaoSpring {

    public static void main(String[] args) {
        Application.launch(AplicacaoJavaFX.class, args);
    }
}
