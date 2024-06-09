package med.vol.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class UserController {
    @GetMapping
    public String olamundo(){
        return "Hello World SpringBoot";
    }
}
