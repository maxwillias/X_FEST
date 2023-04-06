package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifnmg.xfest.entidades.Usuario;
import br.edu.ifnmg.xfest.servicos.UsuarioRepositorio;
import javafx.fxml.FXML;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

@Service
@FxmlView("CADASTRO_NOVO_USUARIO.fxml")
public class CadastroNovoUsuarioController extends Controller{

    @Autowired
	private UsuarioRepositorio usuario;
    
    @FXML
    private Button btnCancelarOS;

    @FXML
    private Button btnCancelarOS1;

    @FXML
    private Button btnVoltar;

    @FXML
    private DatePicker dataDataNascimento;

    @FXML
    private TextField inpBairroUsuario;

    @FXML
    private TextField inpCidadeUsuario;

    @FXML
    private TextField inpContatoUsuario;

    @FXML
    private TextField inpCpfCnpjUsuario;

    @FXML
    private TextField inpEstadoUsuario;

    @FXML
    private TextField inpNomeUsuario;

    @FXML
    private TextField inpNumeroCasaUsuario;

    @FXML
    private TextField inpRuUsuario;

    @FXML
    private TextField inpLoginEmail;

    @FXML
    private TextField inpSenhaCadastro;

    @FXML
    private TextField inpSobrenomeUsuario;

    @FXML
    private BorderPane viewCadastroNovoUsuario;

    @FXML
    void voltarTelaLogin(Event event) {
        carregarScene(viewCadastroNovoUsuario, LoginController.class);
    }


    @FXML
    void SalvarUsuario(Event event) {
        try{
            Usuario usuario = new Usuario();
            usuario.setLogin(inpLoginEmail.getText());
            usuario.setPassword(inpSenhaCadastro.getText());
            this.usuario.Salvar(usuario);
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
        carregarScene(viewCadastroNovoUsuario, FeedPrincipalController.class);
    }

    @FXML
    void voltarTelaLoginCancelar(Event event) {
        carregarScene(viewCadastroNovoUsuario, LoginController.class);
    }

}
