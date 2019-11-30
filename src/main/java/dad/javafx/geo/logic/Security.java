
package dad.javafx.geo.logic;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "is_proxy",
    "proxy_type",
    "is_crawler",
    "crawler_name",
    "crawler_type",
    "is_tor",
    "threat_level",
    "threat_types"
})
public class Security {

    @JsonProperty("is_proxy")
    private Boolean isProxy;
    @JsonProperty("proxy_type")
    private Object proxyType;
    @JsonProperty("is_crawler")
    private Boolean isCrawler;
    @JsonProperty("crawler_name")
    private Object crawlerName;
    @JsonProperty("crawler_type")
    private Object crawlerType;
    @JsonProperty("is_tor")
    private Boolean isTor;
    @JsonProperty("threat_level")
    private String threatLevel;
    @JsonProperty("threat_types")
    private Object threatTypes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("is_proxy")
    public Boolean getIsProxy() {
        return isProxy;
    }

    @JsonProperty("is_proxy")
    public void setIsProxy(Boolean isProxy) {
        this.isProxy = isProxy;
    }

    @JsonProperty("proxy_type")
    public Object getProxyType() {
        return proxyType;
    }

    @JsonProperty("proxy_type")
    public void setProxyType(Object proxyType) {
        this.proxyType = proxyType;
    }

    @JsonProperty("is_crawler")
    public Boolean getIsCrawler() {
        return isCrawler;
    }

    @JsonProperty("is_crawler")
    public void setIsCrawler(Boolean isCrawler) {
        this.isCrawler = isCrawler;
    }

    @JsonProperty("crawler_name")
    public Object getCrawlerName() {
        return crawlerName;
    }

    @JsonProperty("crawler_name")
    public void setCrawlerName(Object crawlerName) {
        this.crawlerName = crawlerName;
    }

    @JsonProperty("crawler_type")
    public Object getCrawlerType() {
        return crawlerType;
    }

    @JsonProperty("crawler_type")
    public void setCrawlerType(Object crawlerType) {
        this.crawlerType = crawlerType;
    }

    @JsonProperty("is_tor")
    public Boolean getIsTor() {
        return isTor;
    }

    @JsonProperty("is_tor")
    public void setIsTor(Boolean isTor) {
        this.isTor = isTor;
    }

    @JsonProperty("threat_level")
    public String getThreatLevel() {
        return threatLevel;
    }

    @JsonProperty("threat_level")
    public void setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
    }

    @JsonProperty("threat_types")
    public Object getThreatTypes() {
        return threatTypes;
    }

    @JsonProperty("threat_types")
    public void setThreatTypes(Object threatTypes) {
        this.threatTypes = threatTypes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
