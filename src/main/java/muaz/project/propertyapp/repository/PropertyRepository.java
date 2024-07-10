package muaz.project.propertyapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import muaz.project.propertyapp.model.Property;

import java.util.List;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
    // NOTES:
    // JDBC and JPA differ in abstraction, JDBC is lower level standard for interaction with databases whilst JPA is higher level.
    // JPA helps avoid more boilerplate code and the developer would have to deal with sql less and more with the classes.
    // JPA = API for accessing, persisting and managing data between java objects.
    // Object persistance = individual objects, can outlive application process by saving into data stores

}
