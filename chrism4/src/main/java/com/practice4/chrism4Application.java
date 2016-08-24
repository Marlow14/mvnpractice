package com.practice4;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class chrism4Application extends Application<chrism4Configuration> {

    public static void main(final String[] args) throws Exception {
        new chrism4Application().run(args);
    }

    @Override
    public String getName() {
        return "chrism4";
    }

    @Override
    public void initialize(final Bootstrap<chrism4Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final chrism4Configuration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
