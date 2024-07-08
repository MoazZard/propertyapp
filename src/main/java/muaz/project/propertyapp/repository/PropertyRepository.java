package muaz.project.propertyapp.repository;

import org.springframework.stereotype.Repository;
import muaz.project.propertyapp.model.Property;

import java.util.List;

import org.springframework.jdbc.core.simple.JdbcClient;

@Repository
public class PropertyRepository {

    private final JdbcClient jdbcClient; // Dependency injection

    public PropertyRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<Property> findAll() {
        return jdbcClient.sql("select * from property")
        .query(Property.class) // mapping to
        .list(); // turn into a list
    }
}
