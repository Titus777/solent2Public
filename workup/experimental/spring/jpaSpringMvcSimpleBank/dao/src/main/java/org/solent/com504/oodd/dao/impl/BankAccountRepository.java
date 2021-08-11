/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.oodd.dao.impl;

import org.solent.com504.oodd.bank.model.dao.BankAccountDAO;
import org.solent.com504.oodd.bank.model.dto.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cgallen
 */
@Repository
public interface BankAccountRepository extends BankAccountDAO,  JpaRepository<BankAccount,Long>{
  
}
