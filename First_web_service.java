package core;

import javax.ws.rs.*;

@Path("/")
public class App {

	@POST
	@Path("/post")
	public String post()   {return "This is my first web service using POST method";}

	@GET
	@Path("/get")
	public String get()    {return "Hello Sergei";}
	
	@PUT
	@Path("/put")
	public String put()    {return "This is my first web service using PUT method";}
	
	@DELETE
	@Path("/delete")
	public String delete() {return "This is my first web service using DELETE method";}
}
