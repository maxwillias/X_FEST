package br.edu.ifnmg.xfest.apresentacao_javafx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifnmg.xfest.entidades.Usuario;
import br.edu.ifnmg.xfest.servicos.UsuarioRepositorio;
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

    @Autowired
	private UsuarioRepositorio usuario;



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

        Usuario u = new Usuario();
        u.setLogin(inpLoginEmail.getText());
        u.setPassword(inpLoginSenha.getText());

        List<Usuario> resultado = usuario.Buscar(u);
        
        //btnLoginEntrar.setText(inpLoginSenha.getText());


        if (u.equals(resultado.get(0))) {
            carregarScene(viewLogin, FeedPrincipalController.class);
        } else {
            
        }

    }
    
    @FXML
    void criarConta(Event event) {
        carregarScene(viewLogin, CadastroNovoUsuarioController.class);
    }
}
