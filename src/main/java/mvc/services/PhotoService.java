package mvc.services;

import mvc.entities.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mvc.repositories.PhotoRepository;
@Service
public class PhotoService {

    @Autowired
    private PhotoRepository repository;

    public void addPhoto(int id, Photo photo){
        repository.addPhoto(id,photo);

    }

    public Photo receivePhoto(int id) {
        Photo photo = repository.receivePhoto(id);
        return photo;
    }
}
