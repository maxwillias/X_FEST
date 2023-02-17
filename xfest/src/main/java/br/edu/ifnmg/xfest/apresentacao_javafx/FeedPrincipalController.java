package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

@FxmlView("FEED_PRINCIPAL_XFEST.fxml")
public class FeedPrincipalController {
    @FXML
    private VBox Teste;

    @FXML
    private TextField inpPesquisa;
}
