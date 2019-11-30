package dad.javafx.geo.app;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;


import dad.javafx.geo.logic.GeoServicio;
import dad.javafx.geo.logic.LocationMessage;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class rootController  implements Initializable {

	    @FXML
	    private VBox View;

	    @FXML
	    private HBox view;

	    @FXML
	    private ImageView imageView;

	    @FXML
	    private TextField ipText;

	    @FXML
	    private Button checkButton;

	    @FXML
	    private TabPane tabpane;

	    @FXML
	    private Tab locactionTab;

	    @FXML
	    private Tab conectionTab;

	    @FXML
	    private Tab segurityTab;

	    private LocationController locationController =new LocationController();
	    private StringProperty texto=new SimpleStringProperty();
	    private ConnectionController connectionController=new ConnectionController();
	    private SegurityController segurityController=new SegurityController();
	    private ObjectProperty<LocationMessage> locationObject=new SimpleObjectProperty<LocationMessage>();
	    
	    public rootController() throws IOException {
	    	FXMLLoader loader=new FXMLLoader(getClass().getResource("/fxml/rootView.fxml"));
			loader.setController(this);
			loader.load();
		} 
	    
		public void initialize(URL location, ResourceBundle resources) {
			locactionTab.setContent(locationController.getView());	
			conectionTab.setContent(connectionController.getView());
			segurityTab.setContent(segurityController.getView());
			ipText.textProperty().bindBidirectional(texto);
			locationController.getModel().locationObjectProperty().bind(locationObject);
			connectionController.getModel().locationObjectProperty().bind(locationObject);
			segurityController.getModel().locationObjectProperty().bind(locationObject);
			
			try (java.util.Scanner s = new java.util.Scanner(new java.net.URL("https://api.ipify.org").openStream(), "UTF-8").useDelimiter("\\A")) {
			    texto.set(s.next());
			} catch (java.io.IOException e) {
			    e.printStackTrace();
			}
		}
		
	    @FXML
	    void onCheckIPACTION(ActionEvent event) throws MalformedURLException {
	    	Task<LocationMessage> tarea = new Task<LocationMessage>() {

				@Override
				protected LocationMessage call() throws Exception {
			    	GeoServicio geo =new GeoServicio(); 
			    	LocationMessage aux=new LocationMessage();
			    	aux=geo.getLocationData(texto.get());
			    if(aux.getLatitude()==null)
						throw new Exception();
					return  aux;
				}
			};
			tarea.setOnSucceeded(e -> {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Éxito");
				alert.setHeaderText("Todo fue bien");
				alert.setContentText(e.getSource().getMessage());
				locationObject.bind(tarea.valueProperty());
				alert.showAndWait();
			});
			tarea.setOnFailed(e -> {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Fallo");
				alert.setHeaderText("Algo fue mal");
				alert.setContentText("RESIVE SU CONEXCIÓN O QUE LA IP EXISTA");
				alert.showAndWait();
			});
			
			tarea.setOnCancelled(e -> {
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("Fallo");
				alert.setHeaderText("Cancelada");
				alert.setContentText("...Porque tocas!!!");
				alert.showAndWait();
			});

			new Thread(tarea).start();
		}
	    	
	    	
	    	
	  

	    public VBox getView() {
			return View;
		}
}
