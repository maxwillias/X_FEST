package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import org.springframework.stereotype.Service;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

@Service
@FxmlView("TELA_USUARIO.fxml")
public class UsuarioController extends Controller{

    @FXML
    private BorderPane viewUsuario;

    @FXML
    private Label NomeUsuario;

    @FXML
    private VBox Teste;

    @FXML
    private Button btnSair;

    @FXML
    private MenuButton dropCriar;

    @FXML
    private MenuItem dropOpOrdemServico;

    @FXML
    private MenuItem dropOpServico;

    @FXML
    private TextField inpPesquisa;

    @FXML
    private Tab tabOrdrmServico;

    @FXML
    private Tab tabServico;

    @FXML
    public void sairConta(Event event) {
        carregarScene(viewUsuario, LoginController.class);
    }
    
}
