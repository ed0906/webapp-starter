package webapp.resources;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Singleton
public class HelloResource {

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String hello() {
        return "Hello";
    }

    @GET
    @Path("/bye")
    @Produces({MediaType.TEXT_PLAIN})
    public String goodbye() {
        return "bye";
    }
}
