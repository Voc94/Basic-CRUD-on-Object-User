package model;

// Java Bean -


import java.time.LocalDateTime;

public class Pizza{

    private Long id;

    private String chef;

    private String name;

    private LocalDateTime deliveryDateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDeliveryDateTime() {
        return deliveryDateTime;
    }

    public void setDeliveyDateTime(LocalDateTime deliveyDateTime) {
        this.deliveryDateTime = deliveyDateTime ;
    }
    @Override
    public String toString(){
        return String.format("Id: %d | Name: %s | Chef: %s | Date: %s Hour: %s Minute: %s", this.id, this.name, this.chef, this.deliveryDateTime.toLocalDate(),this.deliveryDateTime.getHour(),this.deliveryDateTime.getMinute());
    }
}

