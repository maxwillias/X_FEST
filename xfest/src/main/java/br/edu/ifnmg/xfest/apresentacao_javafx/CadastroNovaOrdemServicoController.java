package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

@FxmlView("CADASTRO_NOVA_ORDEN_SERVICO.fxml")
public class CadastroNovaOrdemServicoController {
    @FXML
    private Button btnCancelarOS;

    @FXML
    private Button btnSalvarOS;

    @FXML
    private CheckBox chkBuffet;

    @FXML
    private CheckBox chkDecoracao;

    @FXML
    private CheckBox chkGarcom;

    @FXML
    private CheckBox chkIluminacao;

    @FXML
    private CheckBox chkLimpeza;

    @FXML
    private CheckBox chkLocal;

    @FXML
    private CheckBox chkSom;

    @FXML
    private CheckBox chkSom1;

    @FXML
    private DatePicker dataDataOS;

    @FXML
    private TextField inpBairroOS1;

    @FXML
    private TextField inpCidadeOS1;

    @FXML
    private TextField inpContatoOS;

    @FXML
    private TextField inpDescricaoOS;

    @FXML
    private TextField inpEstadoOS1;

    @FXML
    private TextField inpNomeOS;

    @FXML
    private TextField inpNumeroLocalOS1;

    @FXML
    private TextField inpRuaOS1;

    @FXML
    private TextField inpTamanhoEvento;

}
