package br.edu.ifnmg.xfest.apresentacao_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Hyperlink;
import net.rgielen.fxweaver.core.FxmlView;

@FxmlView("TELA_LOGIN.fxml")
public class LoginController {

    @FXML
    private Button btnLoginEntrar;

    @FXML
    private TextField inpLoginEmail;

    @FXML
    private TextField inpLoginSenha;

    @FXML
    private Hyperlink lblCriarConta;
    
}
