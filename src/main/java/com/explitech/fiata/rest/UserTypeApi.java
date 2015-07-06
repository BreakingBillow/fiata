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
import com.explitech.fiata.model.UserType;
import com.explitech.fiata.model.UserTypeExample;
import com.explitech.fiata.service.UserTypeService;


@Component
@Path("/usertype")
public class UserTypeApi {
	
	@Autowired
	UserTypeService userTypeService;
	
    @Context
    UriInfo uriInfo;

    @Context
    Request request;

    // Return the list of user types
    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    @JsonView({ServiceObjectView.UserTypeView.class})
    public List<UserType> listUserType() {
        try{
        	
        	UserTypeExample example = new UserTypeExample();

        	return userTypeService.list(example);
            
        } catch (Exception e) {
            throw new WebApplicationException(500);
        }
    }
    
    
    
}
