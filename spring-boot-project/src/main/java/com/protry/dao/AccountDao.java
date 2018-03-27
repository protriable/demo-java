package com.protry.dao;

import com.protry.domain.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author bshao
 */
@Repository
public interface AccountDao extends JpaRepository<Account,Integer> {

}
