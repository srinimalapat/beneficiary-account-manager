package com.beneficiaryaccountmanager.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class BeneficiaryDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountName;
    private String accountType;
    private String accountNumber;

    @OneToMany(cascade = CascadeType.ALL)
    private List<BankDetails> bankDetails;
}
