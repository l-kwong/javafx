package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SampleController implements Initializable{

    @FXML
    private TextField txtDate;

    @FXML
    private CheckBox chkOui;
    
    @FXML
    private Label lblCheck;

    @FXML
    private Label lblRadio;
    
    @FXML
    private ComboBox<String> cboChoix;

    @FXML
    private RadioButton rdoNon;

    @FXML
    private TextField txtChoix;

    @FXML
    private Button btnValider;

    @FXML
    private Label lblNom;

    @FXML
    private DatePicker dte;

    @FXML
    private ToggleGroup Choix;

    @FXML
    private RadioButton rdoOui;

    @FXML
    private CheckBox chkNon;

    @FXML
    private RadioButton rdoPeut;

    @FXML
    private TextField txtNom;
    
    public ObservableList<String> list=FXCollections.observableArrayList("Rouge","Jaune","Vert","Blanc");

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		cboChoix.setItems(list);
		
	}
	// pour le combobox
	public void comboBoxChanged(ActionEvent e)
	{
		txtChoix.setText(cboChoix.getValue());
	}
	// pour le CheckBox
	public void checkSelect(ActionEvent e)
	{
		String rep="";
		if(chkOui.isSelected())
			rep="Oui";
		if(chkNon.isSelected())
			rep="Non";
		lblCheck.setText(rep);
	}
	// pour le boutons radio
	public void radioSelect(ActionEvent e)
	{
		String rep="";
		if(rdoOui.isSelected())
			rep="Oui";
		else if(rdoNon.isSelected())
			rep="Non";
		else
			rep="Peut être";
		lblRadio.setText(rep);
	}
	// pour le textfeild
	public void txtNomAffiche(ActionEvent e)
	{
		lblNom.setText(txtNom.getText());
	}
	// pour le DatePicker
	public void choixDate(ActionEvent e)
	{
		txtDate.setText(dte.getValue().toString());
	}

}
