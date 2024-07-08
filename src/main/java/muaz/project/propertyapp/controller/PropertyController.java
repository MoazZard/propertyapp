package muaz.project.propertyapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import muaz.project.propertyapp.model.Property;
import muaz.project.propertyapp.repository.PropertyRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


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
    

    
}
