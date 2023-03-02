package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import org.springframework.stereotype.Service;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

@Service
@FxmlView("CADASTRO_NOVO_USUARIO.fxml")
public class CadastroNovoUsuarioController {
    @FXML
    private Button btnCancelarOS;

    @FXML
    private Button btnCancelarOS1;

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
}
