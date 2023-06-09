import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("")
public class Cadastro {

    private final Template cadastro;

    public Cadastro(Template cadastro) {
        this.cadastro = cadastro;
    }

    @GET
    @Path("/cadastro")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getCadastro() {
        return cadastro.instance();
    }

}
