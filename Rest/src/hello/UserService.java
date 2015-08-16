package hello;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/UserService")
public class UserService {

   
   @GET
   @Path("/my")
   @Produces(MediaType.TEXT_HTML)
   public String getUsers(){
      System.out.println("sfsaf");
      return "<html><body><h1>Hello</h1></body></html>";
   }	
   
   @GET
   @Path("/users")
   @Produces(MediaType.TEXT_HTML)
   public String getMys(){
      System.out.println("Helloooooo");
      return "<html><body><h1>My Users</h1></body></html>";
   }	
}