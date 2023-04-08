package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import java.io.IOException;

import org.springframework.stereotype.Service;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

@Service
@FxmlView("FEED_PRINCIPAL_xFEST.fxml")
public class FeedPrincipalController extends Controller {

    @FXML
    private VBox vbFeedCardServicos;
    
    @FXML
    private VBox vbFeedCardOrdensServicos;

    @FXML
    private TextField inpPesquisa;

    @FXML
    private MenuItem miNovaOrdemServico;

    @FXML
    private MenuItem miNovoServico;

    @FXML
    private ImageView userImagem;

    @FXML
    private BorderPane viewFeedPrincipal;

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

                vbFeedCardServicos.getChildren().add(vBox);
                vbFeedCardOrdensServicos.getChildren().add(vBoxOS);


            } catch (IOException e) {
                e.printStackTrace();
            }   
        }
        super.initialize();
    }

    @FXML
    void criarOrdemServico(Event event) {
        carregarScene(viewFeedPrincipal, CadastroNovaOrdemServicoController.class);
    }

    @FXML
    void criarServico(Event event) {
        carregarScene(viewFeedPrincipal, CadastroNovoServicoController.class);
    }

    @FXML
    void PerfilUsuario(Event event) {
        carregarScene(viewFeedPrincipal, UsuarioController.class);
    }


    
}
