import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("")
public class produtos {

    private final Template produtos ;

    public produtos(Template produtos) {
        this.produtos = produtos;
    }

    @GET
    @Path("/produtos")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getprodutos() { return produtos.instance();
    }

}