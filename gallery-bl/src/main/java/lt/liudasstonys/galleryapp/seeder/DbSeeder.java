package lt.liudasstonys.galleryapp.seeder;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lt.liudasstonys.galleryapp.repository.ImageRepository;
import lt.liudasstonys.galleryapp.service.DbService;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
@RequiredArgsConstructor
@Slf4j
public class DbSeeder {

    private final ResourceLoader resourceLoader;
    private final ImageRepository imageRepository;
    private final DbService dbService;
    private final String[] filesPath = {
//            "../gallery-bl/src/main/java/lt/liudas/assets/1.jpeg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/2.jpeg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/3.jpeg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/4.jpeg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/5.jpeg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/6.jpeg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/7.jpeg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/8.jpeg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/9.jpeg",
//            "../gallery-bl/src/main/java/lt/liudas/assets/10.jpeg",
            "../gallery-bl/src/main/java/lt/liudas/assets/17.jpeg"
    };

    @EventListener
    public void seed(ContextRefreshedEvent event) throws IOException {
        seedImageTable();
//        seedCategoryTable();
//        seedTagsTable();
    }

    private void seedImageTable() throws IOException {
//        imageRepository.save(new Image());
//        imageRepository.save(new Image());
//        imageRepository.save(new Image());
//        imageRepository.save(new Image());
//        imageRepository.save(new Image());
//
//        DbSeeder.log.info("Images found with findAll():");
//        DbSeeder.log.info("-------------------------------");
//        for (Image image : imageRepository.findAll()) {
//            DbSeeder.log.info(image.getId().toString() + ": " + image.toString());
//        }
//        DbSeeder.log.info("");
//
//        DbSeeder.log.info("Image found with findById(1L):");
//        DbSeeder.log.info("--------------------------------");
//        Optional<Image> image = imageRepository.findById(1L);
//        DbSeeder.log.info(image.toString());
//        DbSeeder.log.info("");

//        https://howtodoinjava.com/spring-boot2/read-file-from-resources/
//        https://www.mkyong.com/java/java-read-a-file-from-resources-folder/

        File file = resourceLoader.getResource("classpath:17.jpeg").getFile();
        System.out.println(file.getPath());

//        System.out.println(Path.of("classpath:17.jpeg"));

//        System.out.println(System.getProperty("user.dir"));
//        System.out.println(new File(".").getCanonicalPath());

//        Files.readAllBytes(Path.of("C:/Users/liudas.stonys/IdeaProjects/gallery-app/gallery-bl/src/main/java/lt/liudasstonys/galleryapp/assets/17.jpeg"));
//        Files.readAllBytes(Path.of("assets/17.jpeg"));
//        Files.readAllBytes(Path.of("17.jpeg"));

//        for (String filePath : filesPath) {
//            File file = new File(filePath);
//            Path path = Path.of(filePath);
//
//            String title = file.getName();
//            String mime = Files.probeContentType(path);
//            byte[] data = Files.readAllBytes(path);
//            Long size = file.length();
//            String description = file.toString();
//
////            dbService.saveImage(title, mime, data, size, description);
//        }
    }
}
