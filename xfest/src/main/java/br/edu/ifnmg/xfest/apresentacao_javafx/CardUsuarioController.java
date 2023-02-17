package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

@FxmlView("CARD_CANDIDATO.fxml")
public class CardUsuarioController {
    @FXML
    private Button btnAceitarCandidato;

    @FXML
    private Button btnCancelarCandidato;

    @FXML
    private Label lblNomeCandidato;

    @FXML
    private Label lblServicoCandidato;
    
}
