package com.learning;
import com.learning.resources.resourceClass;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class mainApplication extends Application<configurationClass>{
    public static void main(String[] args) throws Exception {
        new mainApplication().run(args);

    }

    @Override
    public String getName() {
        return "dropwizard-demo-project";
    }

    @Override
    public void initialize(Bootstrap<configurationClass> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(configurationClass configuration,
                    Environment environment) {
        // nothing to do yet
        final resourceClass resourceClass=new resourceClass();
        environment.jersey().register(resourceClass);
    }
}
