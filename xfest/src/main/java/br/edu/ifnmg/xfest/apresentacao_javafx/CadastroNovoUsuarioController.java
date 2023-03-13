package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import org.springframework.stereotype.Service;

import javafx.fxml.FXML;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

@Service
@FxmlView("CADASTRO_NOVO_USUARIO.fxml")
public class CadastroNovoUsuarioController extends Controller{
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
    private TextField inpSenha;

    @FXML
    private TextField inpSenhaConfirmacao;

    @FXML
    private TextField inpSobrenomeUsuario;

    @FXML
    private BorderPane viewCadastroNovoUsuario;

    @FXML
    void voltarTelaLogin(Event event) {
        carregarScene(viewCadastroNovoUsuario, LoginController.class);
    }
}
