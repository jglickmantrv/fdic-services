package com.nrv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"jakarta.persistence", "com.nrv"})
//@EnableJpaRepositories("com.nrv")
//@EntityScan("com.nrv")
public class FdicApplication {

    public static void main(String[] args) {
        SpringApplication.run(FdicApplication.class, args);
    }

    /*
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FdicServicesApplication.class);
    }

     */

}
