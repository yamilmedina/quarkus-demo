package dev.yamil.quarkus.demo;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DefaultSayHelloService implements SayHelloService {

    @Inject
    public DefaultSayHelloService() {
        //here I could inject clients =)
    }

    @Override
    public String getMessage(String greeting) {
        return "hello " + greeting;
    }
}
