package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import java.io.IOException;

import org.springframework.stereotype.Service;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
    private Button btnVoltar;

    @FXML
    private BorderPane viewUsuario;

    @FXML
    private Label NomeUsuario;

    @FXML
    private VBox vbServicoUsuario;

    @FXML
    private VBox vbOrdemServicoUsuario;

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
    void voltarFeedPrincipal(Event event) {
        carregarScene(viewUsuario, FeedPrincipalController.class);
    }

    @FXML
    public void sairConta(Event event) {
        carregarScene(viewUsuario, LoginController.class);
    }

    @FXML
    @Override
    public void initialize() {
        for (int i = 0; i < 10; i++) {
            FXMLLoader loader = new FXMLLoader();
            FXMLLoader loaderOS =  new FXMLLoader();

            loader.setLocation(getClass().getResource("/br/edu/ifnmg/xfest/apresentacao_javafx/CARD_SERVICOS.fxml"));
            loaderOS.setLocation(getClass().getResource("/br/edu/ifnmg/xfest/apresentacao_javafx/CARD_ORDEM_SERVICOS.fxml"));


            VBox vBox;
            VBox vBoxOS;

            try {
                vBox = loader.load();
                vBoxOS = loaderOS.load();

                vbServicoUsuario.getChildren().add(vBox);
                vbOrdemServicoUsuario.getChildren().add(vBoxOS);


            } catch (IOException e) {
                e.printStackTrace();
            }   
        }
        super.initialize();
    }



    
}
