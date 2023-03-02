package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import org.springframework.stereotype.Service;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

@Service
@FxmlView("CARD_SERVICOS.fxml")
public class CardServicosController {
    @FXML
    private Button btnContratarServico;

    @FXML
    private Text lblDescricaoServico;

    @FXML
    private Label lblNomeFornecedor;

    @FXML
    private Label lblNomeServico;
}
