package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifnmg.xfest.entidades.Servico;
import br.edu.ifnmg.xfest.servicos.ServicosRepositorio;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

@Service
@FxmlView("CADASTRO_NOVO_SERVICO.fxml")
public class CadastroNovoServicoController extends Controller{


    @Autowired
    private ServicosRepositorio servicoRepo;



    @FXML
    private Button btnCancelarServico;

    @FXML
    private Button btnSalvarServico;

    @FXML
    private Button btnVoltar;

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
    private TextField inpBairroOS1;

    @FXML
    private TextField inpCidadeOS1;

    @FXML
    private TextField inpEmailServico;

    @FXML
    private TextField inpEstadoOS1;

    @FXML
    private TextField inpNomeServico;

    @FXML
    private TextField inpNumeroLocalOS1;

    @FXML
    private TextField inpRuaOS1;

    @FXML
    private TextField inpTelServico;

    @FXML
    private TextField inpValorServico1;

    @FXML
    private TextArea txtDescricao;

    @FXML
    private BorderPane viewCriarNovoServico;

    

    @FXML
    void voltarFeedPrincipal(Event event) {
        carregarScene(viewCriarNovoServico, FeedPrincipalController.class);
    }
    @FXML
    void CancelarVoltar(Event event) {

    }

    @FXML
    void SalvarServico(Event event) {
        Servico servico = new Servico();
        try{

            servico.setNome(inpNomeServico.getText());
            servico.setDescricao(txtDescricao.getText());
            servico.setValorServico(Float.parseFloat(inpValorServico1.getText()) );
            servico.setTelServico(inpTelServico.getText());
            servico.setEmailServico(inpEmailServico.getText());
    
            servicoRepo.Salvar(servico);
        }finally{

            carregarScene(viewCriarNovoServico, FeedPrincipalController.class);

        }

        

        //teste
        // servico.setTelServico(inpTelServico.getText());
        // servico.setDescricao(txtDescricao.getText());
        // servico.setEmailServico(inpEmailServico.getText());
        
        // btnCancelarServico.setText(servico.getDescricao() );
        /* if(chkSom.isSelected() ){
            btnCancelarServico.setText(chkSom.getText());
            //servico.setTipoServico(Integer.parseInt(tipoServico.getText()));
        } */


    }
}
