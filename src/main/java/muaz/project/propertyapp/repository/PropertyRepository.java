package muaz.project.propertyapp.repository;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.simple.JdbcClient;

@Repository
public class PropertyRepository {

    private final JdbcClient jdbcClient; // Dependency injection

    public PropertyRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    
}
