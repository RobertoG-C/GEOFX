package dad.javafx.geo.app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class LocationController implements Initializable {

	@FXML
	private GridPane view;

	@FXML
	private Label latidudeDataLabel;

	@FXML
	private Label longitudDataLabel;

	@FXML
	private Label cityStageDataLabel;

	@FXML
	private Label lenguageDataLabel;

	@FXML
	private Label callingCodeDataLabel;

	@FXML
	private Label zipCodeDataLabel;

	@FXML
	private Label timeZoneDataLabel;

	@FXML
	private Label currencyDataLabel;

	@FXML
	private Label locationDataLabel;
	
	@FXML
    private ImageView imagenView;

	private LocationModel model =new LocationModel();
	public LocationController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LocationView.fxml"));
		loader.setController(this);
		loader.load();
	}

	public void initialize(URL location, ResourceBundle resources) {
		latidudeDataLabel.textProperty().bind(model.latitudeProperty().asString());
		longitudDataLabel.textProperty().bind(model.longitudeProperty().asString());
		cityStageDataLabel.textProperty().bind(model.staceCityProperty());
		imagenView.imageProperty().bind(model.flagProperty());
		locationDataLabel.textProperty().bind(model.locationProperty());
		zipCodeDataLabel.textProperty().bind(model.zipCodeProperty());
		lenguageDataLabel.textProperty().bind(model.languajeProperty());		
		timeZoneDataLabel.textProperty().bind(model.timeZoneProperty());
		callingCodeDataLabel.textProperty().bind(model.callingCodeProperty());
		currencyDataLabel.textProperty().bind(model.currencyProperty());
		model.locationObjectProperty().addListener((o,ov,nv) -> newIP());
	}

	private void newIP() {
		model.setLongitude(model.getLocationObject().getLongitude());
		model.setLatitude(model.getLocationObject().getLatitude());
		model.setStaceCity(model.getLocationObject().getCity()+"/"+model.getLocationObject().getCountryName());
		model.setZipCode(model.getLocationObject().getZip());
		model.setLanguaje(model.getLocationObject().getLocation().getLanguages().get(0).getName());
		String url="imagen/64x42/"+model.getLocationObject().getCountryCode()+".png";
		model.setFlag(new Image(url));
		model.setCallingCode("+"+model.getLocationObject().getLocation().getCallingCode());
		try {
		model.setTimeZone(model.getLocationObject().getTimeZone().getCode());
		} catch (NullPointerException e) {
			model.setTimeZone("Requiere Suscripción");
		}
		try {	
		model.setCurrency(model.getLocationObject().getCurrency().getName()+"("+model.getLocationObject().getCurrency().getCode()+")");
	} catch (NullPointerException e) {
		model.setCurrency("Requiere Suscripción");
	}
	
	}

	public GridPane getView() {
		return view;
	}
	public LocationModel getModel() {
		return model;
	}
}
