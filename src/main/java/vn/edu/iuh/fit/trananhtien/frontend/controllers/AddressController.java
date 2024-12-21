package vn.edu.iuh.fit.trananhtien.frontend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @GetMapping("/index")
    public String welcome(){
        return "";
    }
}
