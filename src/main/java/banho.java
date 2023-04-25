import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



    @Path("")
    public class banho {

        private final Template banho;

        public banho(Template banho) {
            this.banho = banho;
        }

        @GET
        @Path("/banho")
        @Produces(MediaType.TEXT_HTML)
        public TemplateInstance getbanho() {
            return banho.instance();
        }

    }

