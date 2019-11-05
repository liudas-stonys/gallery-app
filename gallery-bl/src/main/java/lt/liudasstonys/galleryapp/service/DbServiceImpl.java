package lt.liudasstonys.galleryapp.service;

import lt.liudasstonys.galleryapp.entity.Image;
import lt.liudasstonys.galleryapp.repository.ImageRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class DbServiceImpl implements DbService {

    private final ImageRepository imageRepository;

    public DbServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public Image saveImage(String title, String description, MultipartFile file) throws IOException {
        Image image = new Image(title, file.getContentType(), file.getBytes(), file.getSize(), description);
        return imageRepository.save(image);
    }
}
