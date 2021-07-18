package com.example.ibcsprimex.repository;

import com.example.ibcsprimex.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
