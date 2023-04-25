import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("")
public class principal {

    private final Template principal ;

    public principal(Template principal) {
        this.principal = principal;
    }

    @GET
    @Path("/principal")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getprincipal() { return principal.instance();
    }

}
