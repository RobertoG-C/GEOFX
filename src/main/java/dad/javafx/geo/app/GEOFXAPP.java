package dad.javafx.geo.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GEOFXAPP extends Application {

	private rootController root;
	@Override
	public void start(Stage primaryStage) throws Exception {
		 root =new rootController();
		primaryStage.setTitle("GEOFXAPP");
		primaryStage.setScene(new Scene(root.getView()));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
