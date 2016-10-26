package webapp.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

/*
* Any configuration for your app can be accessed through this class
*/
public class WebAppStarterConfiguration extends Configuration {

    private String name = "Web Application";

    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public void setName(String name) {
        this.name = name;
    }

}
