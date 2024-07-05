package mvc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "mvc")
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);



//        PhotoController photoController = new PhotoController();
//        photoController.addPhoto(8098, new Photo("photo", "/"));
//
//        System.out.println(photoController.receivePhoto());
    }
}
