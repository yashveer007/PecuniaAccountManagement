package com.capgemini.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.project.entity.Transaction;

@Repository
public interface TransactionEntityDao extends JpaRepository<Transaction, Integer>  {

}
