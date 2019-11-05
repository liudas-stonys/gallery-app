package lt.liudasstonys.galleryapp.repository;

import lt.liudasstonys.galleryapp.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
