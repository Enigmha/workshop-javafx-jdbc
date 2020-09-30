package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	//faz tratamento da acao
	@FXML
	public void onMenuitemSellerAction() {
		System.out.println("onMenuitemVendedor");
	}
	
	@FXML
	public void onMenuitemDepartmentAction() {
		System.out.println("onMenuitemDepartamento");
	}
	
	@FXML
	public void onMenuitemAboutAction() {
		System.out.println("onMenuitemAbout");
	}
	
	

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
				
	}

}
