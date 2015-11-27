package demo.weatherapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot application entry class.
 * @author jzhang
 */
@SpringBootApplication
public class Application {

    /**
     * Main entry method.
     * @param args passed in arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
