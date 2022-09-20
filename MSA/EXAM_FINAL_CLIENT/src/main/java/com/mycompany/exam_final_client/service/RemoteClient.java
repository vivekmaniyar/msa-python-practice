/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.exam_final_client.service;

import java.util.Collection;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 *
 * @author Vivek
 */
@RegisterRestClient(configKey = "rclient")
public interface RemoteClient {
    
    @ClientHeaderParam(name = "authorization",value = "{gettoken}")
    @RolesAllowed("User")
    @GET
    public String get();
    
    @ClientHeaderParam(name = "authorization",value = "{gettoken}")
    @RolesAllowed("Admin")
    @GET
    @Path("getallstates")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<TblState> getallstates();
    
    @ClientHeaderParam(name = "authorization",value = "{gettoken}")
    @RolesAllowed("Admin")
    @GET
    @Path("getcities?states={id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<TblCity> getcity(@PathParam("id")Integer id);
    
    default String gettoken(){
        Config config = ConfigProvider.getConfig();
        String token = "Bearer "+config.getValue("jwt-string", String.class);
        return token;
    }
}
