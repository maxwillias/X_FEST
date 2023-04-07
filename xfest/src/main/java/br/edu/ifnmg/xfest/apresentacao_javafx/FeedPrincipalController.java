package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import org.springframework.stereotype.Service;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

@Service
@FxmlView("FEED_PRINCIPAL_xFEST.fxml")
public class FeedPrincipalController extends Controller {

    @FXML
    private VBox Teste;

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

    //private List<Servico> postServicos;


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
