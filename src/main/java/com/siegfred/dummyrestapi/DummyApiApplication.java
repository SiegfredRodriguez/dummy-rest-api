package com.siegfred.dummyrestapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@OpenAPIDefinition(
        info = @Info(
                title = "Dummy REST API",
                description = "REST API for testing with client interactions.",
                contact = @Contact(
                        name = "J-dar Siegfred Rodriguez"
                ),
                license = @License(
                        name = "GNU Lesser General Public License, version 2.1",
                        url = "https://www.gnu.org/licenses/old-licenses/lgpl-2.1.en.html"
                ),
                version = "0.1"
        )
)
@SpringBootApplication
public class DummyApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DummyApiApplication.class, args);
    }

}
