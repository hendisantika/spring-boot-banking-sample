package com.hendisantika.springbootbankingsample.service;

import com.hendisantika.springbootbankingsample.repository.AccountRepository;
import com.hendisantika.springbootbankingsample.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-banking-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/07/21
 * Time: 05.53
 */
@Service
public class TransactionService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;
}
