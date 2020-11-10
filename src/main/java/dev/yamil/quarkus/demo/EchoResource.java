package dev.yamil.quarkus.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.lang.invoke.MethodHandles;

@Path("/echo")
public class EchoResource {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.Lookup.class.getName());
    private final SayHelloService sayHelloUseCase;

    @Inject
    public EchoResource(SayHelloService sayHelloUseCase) {
        this.sayHelloUseCase = sayHelloUseCase;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam("name") String name) {
        logger.info(sayHelloUseCase.toString());
        return sayHelloUseCase.getMessage(name == null || name.isEmpty() ? "stranger" : name);
    }
}