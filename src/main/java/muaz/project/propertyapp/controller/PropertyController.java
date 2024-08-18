package muaz.project.propertyapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import muaz.project.propertyapp.model.Property;
import muaz.project.propertyapp.repository.PropertyRepository;

import java.util.List;
import java.util.stream.Collectors;

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

    // create read update delete (crud)


    @GetMapping
    List<Property> findProperties(
        @RequestParam(required = false) Long propertyId,
        @RequestParam(required = false) Integer price, // Changed int to Integer
        @RequestParam(required = false) String propertyType,
        @RequestParam(required = false) String marketingAgent
        ) {
        
        if (propertyId != null) {
            return propertyRepository.findAll().stream()
            .filter(property -> propertyId.equals(property.getPropertyId()))
            .collect(Collectors.toList());
        } 
        else if (price != null && price > -1) {
            return propertyRepository.findAll().stream()
            .filter(property -> price.equals(property.getPrice()))
            .collect(Collectors.toList());
        } 
        else if (propertyType != null) {
            return propertyRepository.findAll().stream()
            .filter(property -> propertyType.equals(property.getPropertyType()))
            .collect(Collectors.toList());
        } 
        else if (marketingAgent != null) {
            return propertyRepository.findAll().stream()
            .filter(property -> marketingAgent.equals(property.getMarketingAgent()))
            .collect(Collectors.toList());
        }
        return propertyRepository.findAll();
    }

    /*   private Long propertyId;
    private int price;
    private Type propertyType;
    private LocalDateTime datePosted; */
    



    @ResponseStatus(HttpStatus.CREATED) 
    @PostMapping
    void create(@RequestBody Property property) { 
        propertyRepository.save(property);
    }

    
}
