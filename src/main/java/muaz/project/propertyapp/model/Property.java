package muaz.project.propertyapp.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity(name = "Property")
@Table(name = "Property")
public class Property {

    //entity relationships
    @ManyToOne
    @JoinColumn(name = "marketingAgent_id")
    private MarketingAgent marketingAgent;

    @jakarta.persistence.Id
    @SequenceGenerator(
        name = "property_sequence",
        sequenceName = "property_sequence",
        allocationSize = 1, // increment size by 1 each time
        initialValue = 1 //start at 1
    )
    @GeneratedValue (
        strategy = GenerationType.SEQUENCE,
        generator = "property_sequence" // what we used above
    )
    private Long propertyId;
    private int price;

    @Enumerated(EnumType.ORDINAL)
    private Type propertyType;
    private LocalDateTime datePosted;

    // Constructors
    public Property() {

    }

    public Property(int price, Type propertyType, LocalDateTime datePosted) {
        this.price = price;
        this.propertyType = propertyType;
        this.datePosted = datePosted;
        //this.marketingAgent = marketingAgent;
    }

    // Getters
    public MarketingAgent getMarketingAgent() {
        return marketingAgent;
    }

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
}