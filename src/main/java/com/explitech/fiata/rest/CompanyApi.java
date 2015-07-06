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
import com.explitech.fiata.model.Company;
import com.explitech.fiata.model.CompanyExample;
import com.explitech.fiata.service.CompanyService;


@Component
@Path("/company")
public class CompanyApi {

	@Autowired
	CompanyService companyService;
	

    @Context
    UriInfo uriInfo;

    @Context
    Request request;
	
    // Return the list of company
    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    @JsonView({ServiceObjectView.CompanyView.class})
    public List<Company> listCompany() {
        try{        	
        	CompanyExample example = new CompanyExample();
        	return companyService.list(example);            
        } catch (Exception e) {
            throw new WebApplicationException(500);
        }
    }
}
