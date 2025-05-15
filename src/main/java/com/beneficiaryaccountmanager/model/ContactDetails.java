package com.beneficiaryaccountmanager.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;

@Embeddable
@Data
public class ContactDetails {

    private String legalName;
    private String nickName;
    private String phoneNumber;
    private String emailId;

    @Embedded
    private Address contactDetails;
}
