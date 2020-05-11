package com.capgemini.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.project.entity.AccountNumberGenerator;

@Repository
public interface AccountNumberGeneratorDao extends JpaRepository<AccountNumberGenerator, Integer> {

}
