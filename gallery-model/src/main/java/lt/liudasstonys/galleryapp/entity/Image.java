package lt.liudasstonys.galleryapp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

// TODO: The primary key variable that is declared within the bean class must be declared as public. ???
// https://docs.oracle.com/cd/E16439_01/doc.1013/e13981/undejbs003.htm

@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "data")
public class Image extends BaseEntity {
    private String title;
    private String mime;
//    @Lob
    @Column(name = "data", columnDefinition="blob")
    private byte[] data;
    private Long size;
    private String description;

    public Image(String title, String mime, byte[] data, Long size, String description) {
        this.title = title;
        this.mime = mime;
        this.data = data;
        this.size = size;
        this.description = description;
    }
}
