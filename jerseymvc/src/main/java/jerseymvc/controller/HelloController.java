package jerseymvc.controller;

import java.util.HashMap;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
 
import org.glassfish.jersey.server.mvc.Viewable;
 
@Path("/hello")
public class HelloController {
    @GET
    public Viewable sayHello(@QueryParam("name") @DefaultValue("World") String name) {
        HashMap model = new HashMap();
        model.put("name", name);               
        return new Viewable("/hello", model);
    }
}