package muaz.project.propertyapp.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity(name = "Property")
@Table(name = "Property")
public class Property {

    @jakarta.persistence.Id
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1, // increment size by 1 each time
        initialValue = 1 //start at 1
    )
    @GeneratedValue (
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence" // what we used above
    )
    private Long propertyId;
    private int price;
    private Type propertyType;
    private LocalDateTime datePosted;
    private String marketingAgent;

    // Constructors
    public Property() {

    }

    public Property(Long i, int price, Type propertyType, LocalDateTime datePosted, String marketingAgent) {
        this.propertyId = i;
        this.price = price;
        this.propertyType = propertyType;
        this.datePosted = datePosted;
        this.marketingAgent = marketingAgent;
    }

    // Getters
    public Long getPropertyId() {
        return propertyId;
    }

    public int getPrice() {
        return price;
    }

    public Type getPropertyType() {
        return propertyType;
    }

    public LocalDateTime getDatePosted() {
        return datePosted;
    }

    public String getMarketingAgent() {
        return marketingAgent;
    }

    // Setters
    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    public void setPropertyType(Type propertyType) {
        this.propertyType = propertyType;
    }

    public void setDatePosted(LocalDateTime datePosted) {
        this.datePosted = datePosted;
    }

    public void setMarketingAgent(String marketingAgent) {
        this.marketingAgent = marketingAgent;
    }

    public String getTitle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitle'");
    }
}