package com.example.vehiclebooking.models;

public class VehicleModel {
    private String vehicleId;
    private String vehicleType;
    private String ownerName;
    private String registrationNumber;
    private int totalSeats;
    private double pricePerSeat;
    private String sourceLocation;
    private String destinationLocation;
    private String departureTime;
    private String arrivalTime;
    private float rating;
    private int reviews;
    private String imageUrl;
    private boolean isAvailable;
    private String description;

    public VehicleModel() {
    }

    public VehicleModel(String vehicleId, String vehicleType, String ownerName, 
                       String registrationNumber, int totalSeats, double pricePerSeat,
                       String sourceLocation, String destinationLocation, 
                       String departureTime, String arrivalTime, float rating, 
                       int reviews, String imageUrl, boolean isAvailable, String description) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.ownerName = ownerName;
        this.registrationNumber = registrationNumber;
        this.totalSeats = totalSeats;
        this.pricePerSeat = pricePerSeat;
        this.sourceLocation = sourceLocation;
        this.destinationLocation = destinationLocation;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.rating = rating;
        this.reviews = reviews;
        this.imageUrl = imageUrl;
        this.isAvailable = isAvailable;
        this.description = description;
    }

    // Getters and Setters
    public String getVehicleId() { return vehicleId; }
    public void setVehicleId(String vehicleId) { this.vehicleId = vehicleId; }

    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }

    public int getTotalSeats() { return totalSeats; }
    public void setTotalSeats(int totalSeats) { this.totalSeats = totalSeats; }

    public double getPricePerSeat() { return pricePerSeat; }
    public void setPricePerSeat(double pricePerSeat) { this.pricePerSeat = pricePerSeat; }

    public String getSourceLocation() { return sourceLocation; }
    public void setSourceLocation(String sourceLocation) { this.sourceLocation = sourceLocation; }

    public String getDestinationLocation() { return destinationLocation; }
    public void setDestinationLocation(String destinationLocation) { this.destinationLocation = destinationLocation; }

    public String getDepartureTime() { return departureTime; }
    public void setDepartureTime(String departureTime) { this.departureTime = departureTime; }

    public String getArrivalTime() { return arrivalTime; }
    public void setArrivalTime(String arrivalTime) { this.arrivalTime = arrivalTime; }

    public float getRating() { return rating; }
    public void setRating(float rating) { this.rating = rating; }

    public int getReviews() { return reviews; }
    public void setReviews(int reviews) { this.reviews = reviews; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}