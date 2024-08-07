package muaz.project.propertyapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "MarketingAgent")
public class MarketingAgent {

    @jakarta.persistence.Id
    @SequenceGenerator(
    name = "marketing_sequence",
    sequenceName = "marketing_sequence",
    allocationSize = 1, // increment size by 1 each time
    initialValue = 1 //start at 1
    )
    @GeneratedValue (
        strategy = GenerationType.SEQUENCE,
        generator = "marketing_sequence" // what we used above
    )
    private Long id;

    private String name;
    private String email;
    private String phone;

    // No-argument constructor
    public MarketingAgent() {
    }

    // Constructor with arguments
    public MarketingAgent(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //implement one to many for with mappedBy: marketingAgent
    // study entity relationships

    // Override toString
    @Override
    public String toString() {
        return "MarketingAgent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}