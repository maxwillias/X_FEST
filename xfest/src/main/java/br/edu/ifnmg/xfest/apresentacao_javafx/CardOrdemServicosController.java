package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import org.springframework.stereotype.Service;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

@Service
@FxmlView("CARD_ORDEM_SERVOCOS.fxml")
public class CardOrdemServicosController {
    @FXML
    private Button btnCadidatarOS;

    @FXML
    private Label lblNomeOS;

    @FXML
    private Text txtDescOS;
}
