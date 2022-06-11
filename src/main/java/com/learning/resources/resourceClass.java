package com.learning.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Optional;

@Path("/v1")
public class resourceClass {

    @Path("/getfile")
    @GET
    public String getFileContent(){
        return "File content returned";
    }

}
