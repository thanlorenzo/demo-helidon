package com.demo.helidon;

import javax.enterprise.context.Dependent;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Simple JAXRS resource class.
 */
@Dependent
@Path("/example")
public class ExampleResource {

    /*@Inject
    private GreetingRepository greetingRepository;*/

    @Produces("text/plain")
    @Path("/")
    @GET
    public String get() {
        return "It works!";
    }

    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllUsers() {
        return Response.ok().build();
    }
}
