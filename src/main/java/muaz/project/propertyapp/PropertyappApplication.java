package muaz.project.propertyapp;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import muaz.project.propertyapp.model.Property;
import muaz.project.propertyapp.model.Type;
import muaz.project.propertyapp.repository.PropertyRepository;


@SpringBootApplication
public class PropertyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertyappApplication.class, args);
	}

    @Bean
    CommandLineRunner cmdRunner(PropertyRepository propertyRepository) {
        return args -> {
            // make a property
            Property property = new Property((long) 793,100000,Type.BUNGALOW,LocalDateTime.now());
            propertyRepository.save(property);

            Property property1 = new Property((long) 794,120000,Type.BUNGALOW,LocalDateTime.now());
            propertyRepository.save(property1);
        };
    }

}
