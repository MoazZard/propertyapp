package muaz.project.propertyapp;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import muaz.project.propertyapp.model.Property;
import muaz.project.propertyapp.model.Type;


@SpringBootApplication
public class PropertyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertyappApplication.class, args);

		// make a property
        Property property = new Property();
        property.setPropertyId(1);
        property.setPrice(100000);
        property.setPropertyType(Type.BUNGALOW); // Assuming you have an enum Type with a RESIDENTIAL constant
        property.setDatePosted(LocalDateTime.now());
        property.setMarketingAgent("John Doe");
        property.setUrl("http://example.com/property/1");
	}

}
