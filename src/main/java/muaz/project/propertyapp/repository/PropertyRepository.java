package muaz.project.propertyapp.repository;

import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

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

    public void create(Property property) {
        var updated = jdbcClient.sql("INSERT INTO Property (propertyId, price, propertyType, datePosted, marketingAgent, url) " + "VALUES (?, ?, ?, ?, ?, ?)")
        .params(List.of(property.getPropertyId(), property.getPrice(), property.getPropertyType().toString() , property.getDatePosted(), property.getMarketingAgent(), property.getUrl())) // SPECIFIES WHATS TO BE PARAMETERISED
        .update(); // Function used in CREATE, UPDATE and DELETE and returns how many rows affected

        Assert.state(updated == 1, "Failed to CREATE run: " + property.getTitle() ); // we want to make sure only 1 row is affected, otherwise message is sent
    }
}
