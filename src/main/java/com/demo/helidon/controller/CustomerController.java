package com.demo.helidon.controller;

import com.demo.helidon.repository.CustomerRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("/customer")
public class CustomerController {

    @Inject
    private CustomerRepository customerRepository;

    @Path("/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllCustomers() {
        return Response.ok(this.customerRepository.findAll()).build();
    }
}
