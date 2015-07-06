package com.explitech.fiata.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import org.codehaus.jackson.map.annotate.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.explitech.fiata.common.ServiceObjectView;
import com.explitech.fiata.model.User;
import com.explitech.fiata.model.UserExample;
import com.explitech.fiata.service.UserService;

@Component
@Path("/user")
public class UserApi {
	
	@Autowired
	UserService userService;
	

    @Context
    UriInfo uriInfo;

    @Context
    Request request;

    // Return the list of user types
    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    @JsonView({ServiceObjectView.UserView.class})
    public List<User> listUser() {
        try{        	
        	UserExample example = new UserExample();
        	return userService.list(example);            
        } catch (Exception e) {
            throw new WebApplicationException(500);
        }
    }
    
    
}
