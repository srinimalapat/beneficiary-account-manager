package com.beneficiaryaccountmanager.repository;

import com.beneficiaryaccountmanager.model.Beneficiary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipientRepository extends JpaRepository<Beneficiary, Long> {
}
