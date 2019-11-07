package lt.liudasstonys.galleryapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
@PropertySource({
        "classpath:application-model.properties",
        "classpath:application-bl.properties",
        "classpath:application-api.properties"
})
public class App {
    private final Environment env;

    public App(Environment env) {
        this.env = env;
    }

    @PostConstruct
    private void init() {
        // Logs classpath
        // log.warn("\n" + System.getProperty("java.class.path").replace(";", "\n"));

        log.warn(env.getProperty("meow"));
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}