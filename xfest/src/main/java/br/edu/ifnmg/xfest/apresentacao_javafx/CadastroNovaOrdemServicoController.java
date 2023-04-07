package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifnmg.xfest.entidades.OrdemServico;
import br.edu.ifnmg.xfest.servicos.OrdemServicoRepositorio;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

@Service
@FxmlView("CADASTRO_NOVA_ORDEM_SERVICO.fxml")
public class CadastroNovaOrdemServicoController extends Controller{

    @Autowired
    private OrdemServicoRepositorio ordemServico;

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

    @FXML
    private BorderPane viewCriarNovaOrdemServico;

    @FXML
    void voltarFeedPrincipal(Event event) {
        carregarScene(viewCriarNovaOrdemServico, FeedPrincipalController.class);
    }

    @FXML
    void SalvarOrdemServico(Event event) {
        OrdemServico ordemServico = new OrdemServico();
        ordemServico.setNome(inpNomeOS.getText());
        ordemServico.setDescricao(inpDescricaoOS.getText());
        ordemServico.setTamanhoEvento(inpTamanhoEvento.getText());
        ordemServico.setNumeroContato(inpContatoOS.getText());
        this.ordemServico.Salvar(ordemServico);
        carregarScene(viewCriarNovaOrdemServico, FeedPrincipalController.class);
    }
}
