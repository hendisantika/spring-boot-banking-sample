package com.hendisantika.springbootbankingsample.repository;

import com.hendisantika.springbootbankingsample.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-banking-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/07/21
 * Time: 05.14
 */
public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findBySortCodeAndAccountNumber(String sortCode, String accountNumber);
}
