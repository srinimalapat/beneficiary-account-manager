package com.beneficiaryaccountmanager.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Beneficiary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String preeferredPaymentMethod;
    private String type;
    private Boolean isFavorite;

    @Embedded
    private ContactDetails contactDetails;

    @OneToMany(cascade = CascadeType.ALL)
    private List<BeneficiaryDetails> recipientDetails;
}
