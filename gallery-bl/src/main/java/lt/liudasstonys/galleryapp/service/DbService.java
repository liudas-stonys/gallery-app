package lt.liudasstonys.galleryapp.service;

import lt.liudasstonys.galleryapp.entity.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface DbService {
    Image saveImage(String title, String description, MultipartFile file) throws IOException;
}
