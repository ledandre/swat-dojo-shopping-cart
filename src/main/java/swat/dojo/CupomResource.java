package swat.dojo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/cupom")
public class CupomResource {

    @GET
    public String hello() {
        return "Hello RESTEasy";
    }
}
