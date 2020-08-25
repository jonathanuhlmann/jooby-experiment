package com.imanage;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;

@Path("/")
public class Controller {

    @GET
    public String greet() {
        return "Hello World!";
    }
}
