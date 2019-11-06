package lt.liudasstonys.galleryapp.service;

import lt.liudasstonys.galleryapp.entity.Image;
import lt.liudasstonys.galleryapp.repository.ImageRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DbServiceImpl implements DbService {

    private final ImageRepository imageRepository;

    public DbServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public Image saveImage(String title, String mime, byte[] data, Long size, String description) throws IOException {
        Image image = new Image(title, mime, data, size, description);
        return imageRepository.save(image);
    }
}
