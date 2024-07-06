package muaz.project.propertyapp.model;

import java.time.LocalDateTime;

public class Property {
    
    private int propertyId;
    private int price;
    private Type propertyType;
    private LocalDateTime datePosted;
    private String marketingAgent;
    private String url;

    // Getters
    public int getPropertyId() {
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

    public String getUrl() {
        return url;
    }

    // Setters
    public void setPropertyId(int propertyId) {
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

    public void setUrl(String url) {
        this.url = url;
    }
}