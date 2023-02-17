package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

@FxmlView("CADASTRO_USUARIO.fxml")
public class CadastroUsuarioController {
    @FXML
    private Tab abaDadosPessoais;

    @FXML
    private Tab abaEnderecoUsuario;

    @FXML
    private Tab abaFinalizarCadastro;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnEndProximo;

    @FXML
    private Button btnEndSair;

    @FXML
    private Button btnFinalizarSair;

    @FXML
    private Button btnProximo;

    @FXML
    private Button btnSair;

    @FXML
    private ChoiceBox<?> drpEndDrpUf;

    @FXML
    private ChoiceBox<?> drpGenero;

    @FXML
    private TextField inpConfirmarSenha;

    @FXML
    private TextField inpCpfUsuario;

    @FXML
    private TextField inpDataNascimentoTxt;

    @FXML
    private TextField inpEmail;

    @FXML
    private TextField inpEndBairro;

    @FXML
    private TextField inpEndCep;

    @FXML
    private TextField inpEndCidade;

    @FXML
    private TextField inpEndLogradouro;

    @FXML
    private TextField inpEndNumero;

    @FXML
    private TextField inpEndReferencia;

    @FXML
    private TextField inpPrimeiroNome;

    @FXML
    private TextField inpSenha;

    @FXML
    private TextField inpSobrenome;

    @FXML
    private TextField inpTelefone;
}
