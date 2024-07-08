package muaz.project.propertyapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import muaz.project.propertyapp.model.Property;
import muaz.project.propertyapp.repository.PropertyRepository;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/property")
public class PropertyController {

    private PropertyRepository propertyRepository; // Dependency injection (inversion of control framework)

    public PropertyController(PropertyRepository propertyRepository){
        this.propertyRepository = propertyRepository;
    }

    @GetMapping("")
    List<Property> findAll() {
        return propertyRepository.findAll();
    }
    
    @ResponseStatus(HttpStatus.CREATED) 
    @PostMapping("") 
    void create(@RequestBody Property property) { 
        propertyRepository.create(property);  
    }
    
}
