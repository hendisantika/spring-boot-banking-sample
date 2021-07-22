package com.hendisantika.springbootbankingsample.controller;

import com.hendisantika.springbootbankingsample.service.AccountService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-banking-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/07/21
 * Time: 09.41
 */
@RestController
@RequestMapping("api/v1")
public class AccountRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountRestController.class);

    private static final String INVALID_SEARCH_CRITERIA =
            "The provided sort code or account number did not match the expected format";

    private static final String NO_ACCOUNT_FOUND =
            "Unable to find an account matching this sort code and account number";

    private final AccountService accountService;

    @Autowired
    public AccountRestController(AccountService accountService) {
        this.accountService = accountService;
    }
}
