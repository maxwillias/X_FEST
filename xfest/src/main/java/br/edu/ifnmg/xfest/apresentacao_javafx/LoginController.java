package br.edu.ifnmg.xfest.apresentacao_javafx;

import org.springframework.stereotype.Service;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.AnchorPane;
import net.rgielen.fxweaver.core.FxmlView;

@Service
@FxmlView("TELA_LOGIN.fxml")
public class LoginController extends Controller {

    @FXML
    private AnchorPane viewLogin;

    @FXML
    private Button btnLoginEntrar;

    @FXML
    private TextField inpLoginEmail;

    @FXML
    private TextField inpLoginSenha;

    @FXML
    private Hyperlink lblCriarConta;

    @FXML
    public void autenticar(Event event) {
        carregarScene(viewLogin, UsuarioController.class);
    }
    
    @FXML
    void criarConta(Event event) {
        carregarScene(viewLogin, CadastroNovoUsuarioController.class);
    }
}
