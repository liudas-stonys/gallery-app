package lt.liudasstonys.galleryapp.service;

import lt.liudasstonys.galleryapp.entity.Image;

import java.io.IOException;

public interface DbService {
    Image saveImage(String title, String mime, byte[] data, Long size, String description) throws IOException;
}
