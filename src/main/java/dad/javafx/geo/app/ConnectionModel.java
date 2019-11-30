package dad.javafx.geo.app;

import dad.javafx.geo.logic.LocationMessage;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ConnectionModel {
 private ObjectProperty<LocationMessage> locationObject =new SimpleObjectProperty<LocationMessage>();
 private StringProperty ipAddres =new SimpleStringProperty();
 private StringProperty isp =new SimpleStringProperty();
 private StringProperty type =new SimpleStringProperty();
 private StringProperty hostname =new SimpleStringProperty();
 private IntegerProperty asn =new SimpleIntegerProperty();
public final ObjectProperty<LocationMessage> locationObjectProperty() {
	return this.locationObject;
}

public final LocationMessage getLocationObject() {
	return this.locationObjectProperty().get();
}

public final void setLocationObject(final LocationMessage locationObject) {
	this.locationObjectProperty().set(locationObject);
}

public final StringProperty ipAddresProperty() {
	return this.ipAddres;
}

public final String getIpAddres() {
	return this.ipAddresProperty().get();
}

public final void setIpAddres(final String ipAddres) {
	this.ipAddresProperty().set(ipAddres);
}

public final StringProperty ispProperty() {
	return this.isp;
}

public final String getIsp() {
	return this.ispProperty().get();
}

public final void setIsp(final String isp) {
	this.ispProperty().set(isp);
}

public final StringProperty typeProperty() {
	return this.type;
}

public final String getType() {
	return this.typeProperty().get();
}

public final void setType(final String type) {
	this.typeProperty().set(type);
}

public final StringProperty hostnameProperty() {
	return this.hostname;
}

public final String getHostname() {
	return this.hostnameProperty().get();
}

public final void setHostname(final String hostname) {
	this.hostnameProperty().set(hostname);
}

public final IntegerProperty asnProperty() {
	return this.asn;
}

public final int getAsn() {
	return this.asnProperty().get();
}

public final void setAsn(final int asn) {
	this.asnProperty().set(asn);
}

 
 
}
