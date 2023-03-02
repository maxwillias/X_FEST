package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import org.springframework.stereotype.Service;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

@Service
@FxmlView("TELA_SERVICO.fxml")
public class ServicoController {
    @FXML
    private Button btnCancelarOS;

    @FXML
    private Button btnCancelarOS1;

    @FXML
    private Label lblDataCriacaoServico;

    @FXML
    private Label lblDescricao;

    @FXML
    private Label lblIdOS;

    @FXML
    private Label lblNumContato;

    @FXML
    private Label lblPrecoServico;

    @FXML
    private Label lblTipoServico;

    @FXML
    private Label lblTipoServicos;

    @FXML
    private Label lblTitulo;
    
}
