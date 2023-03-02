package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import org.springframework.stereotype.Service;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

@Service
@FxmlView("TELA_ORDEM_DE_SERVICO.fxml")
public class OrdemServicoController {
    @FXML
    private Button btnCancelarOS;

    @FXML
    private Label lblDataCriacaoOS;

    @FXML
    private Label lblDescricao;

    @FXML
    private Label lblIdOS;

    @FXML
    private Label lblTipoServicos;

    @FXML
    private Label lblTipoServicos1;

    @FXML
    private Label lblTiposDaOS;

    @FXML
    private Label lblTitulo;

    @FXML
    private VBox vboxCandidatos;
    
}
