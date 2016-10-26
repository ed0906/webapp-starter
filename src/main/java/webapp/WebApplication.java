package webapp;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import webapp.configuration.WebAppStarterConfiguration;
import webapp.resources.HelloResource;

public class WebApplication extends Application<WebAppStarterConfiguration> {

    public static void main(String... args) throws Exception {
        if(args.length == 0) {
            args = new String[]{"server"};
        }
        new WebApplication().run(args);
    }

    @Override
    public void run(WebAppStarterConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(HelloResource.class);
    }
}
