package mvc.controllers;

import mvc.entities.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import mvc.services.PhotoService;

@RestController
public class PhotoController {

    @Autowired
    private PhotoService service;

    @PostMapping
    public void addPhoto(int id, Photo photo){
        service.addPhoto(id,photo);
    }

    @GetMapping("/receive")
    public String receivePhoto(@RequestParam("id") int id) {
       Photo photo = service.receivePhoto(id);
       return photo.toString();           //          Photo@798327492
    }
}
