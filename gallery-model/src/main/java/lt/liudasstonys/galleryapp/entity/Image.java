package lt.liudasstonys.galleryapp.entity;

import lombok.*;

import javax.persistence.Entity;

// TODO: The primary key variable that is declared within the bean class must be declared as public. ???
// https://docs.oracle.com/cd/E16439_01/doc.1013/e13981/undejbs003.htm

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "data")
public class Image extends BaseEntity {
    private String title;
    private String mime;
    private byte[] data;
    private Long size;
    private String description;
}
