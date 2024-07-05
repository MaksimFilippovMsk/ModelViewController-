package mvc.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor

public class Photo {

    @Autowired
    private String name;            //      PhotoController     PhotoRepository     PhotoService
    private String path;
    private Type type;

}
