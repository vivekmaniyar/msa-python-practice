package com.mycompany.exam_final.service;

import java.util.Collection;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/example")
public class ExampleService {
    
    @Inject finalbean fb;

    @RolesAllowed("User")
    @GET
    public String get() {
        return "Hello world!";
    }
    
    @RolesAllowed("Admin")
    @GET
    @Path("getallstates")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<TblState> getallstates(){
        return fb.getallstates();
    }
    
    @RolesAllowed("Admin")
    @GET
    @Path("getcities?states={id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<TblCity> getcity(@PathParam("id")Integer id){
        return fb.getcity(id);
    }

}
