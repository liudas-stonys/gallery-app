package lt.liudasstonys.galleryapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource(value = {"classpath:application.properties", "classpath:application-bl.properties"})
@PropertySource("classpath:application-bl.properties")
//@PropertySource("classpath:application-${spring.profiles.active}.properties")
@Slf4j
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        log.error("Multimodule App has started!");

        // Logs classpath
//        log.warn("\n" + System.getProperty("java.class.path").replace(";","\n"));

//        ClassLoader cl = ClassLoader.getSystemClassLoader();
//        URL[] urls = ((URLClassLoader)cl).getURLs();
//        for(URL url: urls){
//            System.out.println(url.getFile());
//        }
    }
}