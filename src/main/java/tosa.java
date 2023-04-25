import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("")
public class tosa {

    private final Template tosa ;

    public tosa(Template tosa) {
        this.tosa= tosa;
    }

    @GET
    @Path("/tosa")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance gettosa() { return tosa.instance();
    }

}