package vn.edu.iuh.fit.trananhtien.frontend.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.trananhtien.backend.models.Address;
import vn.edu.iuh.fit.trananhtien.backend.repositories.AddressRepository;

import java.util.List;


@RestController
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/index")
    public String welcome(HttpServletRequest request){
        return "" + request.getSession().getId();
    }

    @GetMapping("/address")
    public List<Address> address(Model model){
        return addressRepository.findAll();
    }
}
