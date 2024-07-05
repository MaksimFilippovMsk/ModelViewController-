package mvc.repositories;

import mvc.entities.Photo;
import mvc.entities.Type;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
@Repository
public class PhotoRepository {
    private Map<Integer, Photo> map;
    private Scanner scanner = new Scanner(System.in);

    public PhotoRepository() {
        map = new HashMap<>();
        Type type = Type.PNG;
        map.put(123, new Photo("Dog.jpg","/myphotos/", type));

    }

    public void addPhoto(int id, Photo photo) {
        // если факт что мапа содержит данный ключ является false
        if (map.containsKey(id) == false) {
            map.put(id, photo);
        } else {
            System.out.println("This id is busy");
        }
    }

    public Photo receivePhoto(int id) {
        for (Integer key : map.keySet()) {
            if (id == key) {
                Photo photo = map.get(key);       // дай мне значение привязанное к ключу key
                return photo;
            }
        }
        System.out.println("Not result");
        return new Photo(null,null);        // nullовая фотография   fixme
    }
}


