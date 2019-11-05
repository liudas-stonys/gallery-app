//package lt.liudasstonys.galleryapp.config;
//
//import lombok.extern.slf4j.Slf4j;
//import lt.liudasstonys.galleryapp.entity.Image;
//import lt.liudasstonys.galleryapp.repository.ImageRepository;
//import lt.liudasstonys.galleryapp.service.DbService;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Optional;
//
//@Configuration
//@Slf4j
//public class DbConfig {
//
//    String[] filePath = {
//            "../gallery-bl/src/main/java/lt/liudas/assets/2.jpeg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/3.jpeg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/4.jpg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/5.jpg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/6.jpg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/7.jpg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/8.png",
//            "../gallery-bl/src/main/java/lt/liudas/assets/9.jpg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/10.jpg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/1.jpeg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/2.jpeg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/3.jpeg"
//    };
//
//    @Bean
//    public CommandLineRunner dbSeeder(ImageRepository repository, DbService dbService) {
//        return args -> {
//            repository.save(new Image());
//            repository.save(new Image());
//            repository.save(new Image());
//            repository.save(new Image());
//            repository.save(new Image());
//
//            log.info("Images found with findAll():");
//            log.info("-------------------------------");
//            for (Image image : repository.findAll()) {
//                log.info(image.getId().toString() + ": " + image.toString());
//            }
//            log.info("");
//
//            log.info("Image found with findById(1L):");
//            log.info("--------------------------------");
//            Optional<Image> image = repository.findById(1L);
//            log.info(image.toString());
//            log.info("");
//
//            dbService.saveImage()
//        };
//    }
//}
