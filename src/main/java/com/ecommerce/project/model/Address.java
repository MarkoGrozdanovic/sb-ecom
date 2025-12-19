package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;

    @NotBlank
    @Size(min = 5, message = "Street name must be atleast 5 charachters!")
    private String street;

    @NotBlank
    @Size(min = 5, message = "Building name must be atleast 5 charachters!")
    private String buildingName;

    @NotBlank
    @Size(min = 3, message = "City name must be atleast 5 charachters!")
    private String city;

    @NotBlank
    @Size(min = 5, message = "State name must be atleast 5 charachters!")
    private String state;

    @NotBlank
    @Size(min = 5, message = "Country name must be atleast 5 charachters!")
    private String country;

    @NotBlank
    @Size(min = 4, message = "Pincode must be atleast 5 charachters!")
    private String pincode;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Address(String street, String state, String pincode, String country, String city, String buildingName) {
        this.street = street;
        this.state = state;
        this.pincode = pincode;
        this.country = country;
        this.city = city;
        this.buildingName = buildingName;
    }
}
