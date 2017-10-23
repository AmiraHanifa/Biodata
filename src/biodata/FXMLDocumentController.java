/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodata;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author Amira Hanifa
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button buttonproses;
    @FXML
    private Button buttonhapus;
    @FXML
    private TextArea hasil;
    @FXML
    private TextField editnama;
    @FXML
    private TextField editalamat;
    @FXML
    private TextField editabsen;
    @FXML
    private TextField edittelepone;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        String nama=editnama.getText();
        String alamat=editalamat.getText();
        String absen=editabsen.getText();
        String telepon=edittelepone.getText();
        
        hasil.setText("Nama Anda : "+nama+"\n"
        +"Alamat Anda : "+alamat+"\n"
        +"Absen Anda : "+absen+"\n"
        +"Telepon Anda : "+telepon+"\n");
    }

    @FXML
    private void hapus(ActionEvent event) {
        hasil.setText("");
        editnama.setText("");
        editalamat.setText("");
        editabsen.setText("");
        edittelepone.setText("");
        
    }

    @FXML
    private void eeditnama(ActionEvent event) {
    }

    @FXML
    private void eeditalamat(ActionEvent event) {
    }

    @FXML
    private void eeditabs(ActionEvent event) {
    }

    @FXML
    private void eedittelp(ActionEvent event) {
    }
    
}
