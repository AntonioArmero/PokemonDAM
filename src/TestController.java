

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class TestController implements Initializable {

    @FXML
    private Button btnCaptura;

    @FXML
    private void sayHelloWorld(ActionEvent event){
        System.out.println("Hello world");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
}
