package dad.javafx.geo.app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.geo.logic.LocationMessage;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class SegurityController implements Initializable {

    @FXML
    private GridPane view;

    @FXML
    private Label typesLabel;

    @FXML
    private Label safeLabel;

    @FXML
    private CheckBox proxyBox;

    @FXML
    private CheckBox torBox;

    @FXML
    private CheckBox crawlerBox;

    @FXML
    private Label levelLabel;

    private SecurityModel model =new SecurityModel();
    private ObjectProperty<LocationMessage> locationObject =new SimpleObjectProperty<LocationMessage>();
	public SegurityController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SegurityView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		typesLabel.textProperty().bind(model.typeProperty());
		levelLabel.textProperty().bind(model.levelProperty());
		safeLabel.textProperty().bind(model.safeProperty());
		proxyBox.selectedProperty().bind(model.proxyProperty());
		crawlerBox.selectedProperty().bind(model.crawlerProperty());
		torBox.selectedProperty().bind(model.torProperty());
		proxyBox.textProperty().bind(model.errorProxyProperty());
		torBox.textProperty().bind(model.errortorProperty());
		crawlerBox.textProperty().bind(model.errorcrawlerProperty());
		model.locationObjectProperty().addListener((o,ov,nv) -> newIP());
	}

	private void newIP() {
		try {
			model.setProxy(model.getLocationObject().getSecurity().getIsProxy());
		} catch (NullPointerException e) {
			model.setErrorProxy("Requiere Suscripción");
		}
			try {
			model.setCrawler(model.getLocationObject().getSecurity().getIsCrawler());
		} catch (NullPointerException e) {
			model.setErrorcrawler("Requiere Suscripción");
		}
			try {
				model.setTor(model.getLocationObject().getSecurity().getIsTor());
		} catch (NullPointerException e) {
			model.setErrortor("Requiere Suscripción");
		}
			
			try {
		model.setType(model.getLocationObject().getSecurity().getThreatTypes().toString());
	} catch (NullPointerException e) {
		model.setType("Requiere Subcripción");
	}
			try {
		model.setLevel(model.getLocationObject().getSecurity().getThreatLevel());
	} catch (NullPointerException e) {
		model.setLevel("Requiere Suscripción");
	}
	}
	public GridPane getView() {
		return view;
	}
	public SecurityModel getModel() {
		return model;
	}
}
