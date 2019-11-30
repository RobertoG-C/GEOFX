package dad.javafx.geo.app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class  ConnectionController implements Initializable {

    @FXML
    private GridPane view;

    @FXML
    private Label ipLabel;

    @FXML
    private Label typelabel;

    @FXML
    private Label hostnameLabel;

    @FXML
    private Label asnLabel;

    @FXML
    private Label ispLabel;

    private ConnectionModel model =new ConnectionModel();
    public ConnectionController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ConnectionView.fxml"));
		loader.setController(this);
		loader.load();
	}
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	asnLabel.textProperty().bind(model.asnProperty().asString());
	ispLabel.textProperty().bind(model.ispProperty());
	hostnameLabel.textProperty().bind(model.hostnameProperty());
	typelabel.textProperty().bind(model.typeProperty());
	ipLabel.textProperty().bind(model.ipAddresProperty());
	model.locationObjectProperty().addListener((o,ov,nv) -> newIP());
	}
	private void newIP() {
		model.setIpAddres(model.getLocationObject().getIp());
		model.setHostname(model.getLocationObject().getHostname());
		model.setIsp(model.getLocationObject().getRegionName());
		try {
		model.setAsn(model.getLocationObject().getConnection().getAsn());
		} catch (NullPointerException e) {
			model.setAsn(0);
		}
		model.setType(model.getLocationObject().getType());
	}

	public GridPane getView() {
		return view;
	}
	public ConnectionModel getModel() {
		return model;
	}
}
