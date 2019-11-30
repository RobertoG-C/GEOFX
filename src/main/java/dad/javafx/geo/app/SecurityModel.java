package dad.javafx.geo.app;

import dad.javafx.geo.logic.LocationMessage;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SecurityModel {
private StringProperty safe=new SimpleStringProperty();
private StringProperty level=new SimpleStringProperty();
private StringProperty type=new SimpleStringProperty();
private BooleanProperty proxy=new SimpleBooleanProperty();
private BooleanProperty tor=new SimpleBooleanProperty();
private BooleanProperty crawler=new SimpleBooleanProperty();
private StringProperty errorProxy=new SimpleStringProperty();
private StringProperty errortor=new SimpleStringProperty();
private StringProperty errorcrawler=new SimpleStringProperty();
private ObjectProperty<LocationMessage> locationObject =new SimpleObjectProperty<LocationMessage>();

public final StringProperty safeProperty() {
	return this.safe;
}

public final String getSafe() {
	return this.safeProperty().get();
}

public final void setSafe(final String safe) {
	this.safeProperty().set(safe);
}

public final StringProperty levelProperty() {
	return this.level;
}

public final String getLevel() {
	return this.levelProperty().get();
}

public final void setLevel(final String level) {
	this.levelProperty().set(level);
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

public final BooleanProperty proxyProperty() {
	return this.proxy;
}

public final boolean isProxy() {
	return this.proxyProperty().get();
}

public final void setProxy(final boolean proxy) {
	this.proxyProperty().set(proxy);
}

public final BooleanProperty torProperty() {
	return this.tor;
}

public final boolean isTor() {
	return this.torProperty().get();
}

public final void setTor(final boolean tor) {
	this.torProperty().set(tor);
}

public final BooleanProperty crawlerProperty() {
	return this.crawler;
}

public final boolean isCrawler() {
	return this.crawlerProperty().get();
}

public final void setCrawler(final boolean crawler) {
	this.crawlerProperty().set(crawler);
}

public final StringProperty errorProxyProperty() {
	return this.errorProxy;
}

public final String getErrorProxy() {
	return this.errorProxyProperty().get();
}

public final void setErrorProxy(final String errorProxy) {
	this.errorProxyProperty().set(errorProxy);
}

public final StringProperty errortorProperty() {
	return this.errortor;
}

public final String getErrortor() {
	return this.errortorProperty().get();
}

public final void setErrortor(final String errortor) {
	this.errortorProperty().set(errortor);
}

public final StringProperty errorcrawlerProperty() {
	return this.errorcrawler;
}

public final String getErrorcrawler() {
	return this.errorcrawlerProperty().get();
}

public final void setErrorcrawler(final String errorcrawler) {
	this.errorcrawlerProperty().set(errorcrawler);
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

}
