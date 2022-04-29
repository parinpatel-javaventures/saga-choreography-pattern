package com.example.paymentservice.repository;

import com.example.paymentservice.entitiy.UserTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTransactionRepository extends JpaRepository<UserTransaction, Integer> {
}