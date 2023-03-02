package br.edu.ifnmg.xfest.apresentacao_javafx;

import net.rgielen.fxweaver.core.FxmlView;

import org.springframework.stereotype.Service;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

@Service
@FxmlView("TELA_CRIAR_ORDEM_DE_SERVICO.fxml")
public class CriarOrdemServicoController {
    @FXML
    private Button btnCriarOrdemDeServico;

    @FXML
    private Button btnCriarOrdemDeServico1;
    
}
