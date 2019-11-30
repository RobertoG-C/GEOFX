package dad.javafx.geo.app;

import dad.javafx.geo.logic.LocationMessage;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class LocationModel {
 private DoubleProperty longitude=new SimpleDoubleProperty();
 private DoubleProperty latitude=new SimpleDoubleProperty();
 private ObjectProperty<Image> flag =new SimpleObjectProperty<Image>();
 private StringProperty staceCity=new SimpleStringProperty();
 private StringProperty languaje=new SimpleStringProperty();
 private StringProperty timeZone=new SimpleStringProperty();
 private StringProperty callingCode=new SimpleStringProperty();
 private StringProperty currency=new SimpleStringProperty();
 private StringProperty zipCode=new SimpleStringProperty();
 private StringProperty location=new SimpleStringProperty();
 private ObjectProperty<LocationMessage> locationObject=new SimpleObjectProperty<LocationMessage>();

 public final DoubleProperty longitudeProperty() {
	return this.longitude;
}

public final double getLongitude() {
	return this.longitudeProperty().get();
}

public final void setLongitude(final double longitude) {
	this.longitudeProperty().set(longitude);
}

public final DoubleProperty latitudeProperty() {
	return this.latitude;
}

public final double getLatitude() {
	return this.latitudeProperty().get();
}

public final void setLatitude(final double latitude) {
	this.latitudeProperty().set(latitude);
}

public final ObjectProperty<Image> flagProperty() {
	return this.flag;
}

public final Image getFlag() {
	return this.flagProperty().get();
}

public final void setFlag(final Image flag) {
	this.flagProperty().set(flag);
}

public final StringProperty staceCityProperty() {
	return this.staceCity;
}

public final String getStaceCity() {
	return this.staceCityProperty().get();
}

public final void setStaceCity(final String staceCity) {
	this.staceCityProperty().set(staceCity);
}

public final StringProperty languajeProperty() {
	return this.languaje;
}

public final String getLanguaje() {
	return this.languajeProperty().get();
}

public final void setLanguaje(final String languaje) {
	this.languajeProperty().set(languaje);
}

public final StringProperty timeZoneProperty() {
	return this.timeZone;
}

public final String getTimeZone() {
	return this.timeZoneProperty().get();
}

public final void setTimeZone(final String timeZone) {
	this.timeZoneProperty().set(timeZone);
}

public final StringProperty callingCodeProperty() {
	return this.callingCode;
}

public final String getCallingCode() {
	return this.callingCodeProperty().get();
}

public final void setCallingCode(final String callingCode) {
	this.callingCodeProperty().set(callingCode);
}

public final StringProperty currencyProperty() {
	return this.currency;
}

public final String getCurrency() {
	return this.currencyProperty().get();
}

public final void setCurrency(final String currency) {
	this.currencyProperty().set(currency);
}



public final StringProperty locationProperty() {
	return this.location;
}

public final String getLocation() {
	return this.locationProperty().get();
}

public final void setLocation(final String location) {
	this.locationProperty().set(location);
}

public final ObjectProperty<LocationMessage> locationObjectProperty() {
	return this.locationObject;
}

public final LocationMessage getLocationObject() {
	return this.locationObjectProperty().get();
}

public final void setLocationObject(final LocationMessage locationObject) {
	this.locationObjectProperty().set(locationObject);
}

public final StringProperty zipCodeProperty() {
	return this.zipCode;
}


public final String getZipCode() {
	return this.zipCodeProperty().get();
}


public final void setZipCode(final String zipCode) {
	this.zipCodeProperty().set(zipCode);
}


 
 





}


