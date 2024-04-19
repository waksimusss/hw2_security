package hw.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {

    @GetMapping("/hello-all")
    public String helloAll(){
        return "Всем привет!";
    }

    @GetMapping("/hello-admin")
    public String helloAdmin(){
        return "Ну здравствуй админ!";
    }

    @GetMapping("/hello-user")
    public String helloUser(){
        return "Ку привет!";
    }
}
