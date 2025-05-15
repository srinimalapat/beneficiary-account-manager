package com.beneficiaryaccountmanager.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Address {
    private String streetAddress1;
    private String city;
    private String state;
    private String country;
}
