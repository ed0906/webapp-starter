package webapp;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import webapp.configuration.WebappStarterConfiguration;
import webapp.resources.HelloResource;

public class WebApplication extends Application<WebappStarterConfiguration> {

    public static void main(String... args) throws Exception {
        if(args.length == 0) {
            args = new String[]{"server"};
        }
        new WebApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap bootstrap) {

    }

    @Override
    public void run(WebappStarterConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(HelloResource.class);
    }
}
