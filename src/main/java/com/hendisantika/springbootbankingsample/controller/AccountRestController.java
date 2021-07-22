package com.hendisantika.springbootbankingsample.controller;

import com.hendisantika.springbootbankingsample.model.Account;
import com.hendisantika.springbootbankingsample.service.AccountService;
import com.hendisantika.springbootbankingsample.util.AccountInput;
import com.hendisantika.springbootbankingsample.util.InputValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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

    @PostMapping(value = "/accounts",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> checkAccountBalance(
            // TODO In the future support searching by card number in addition to sort code and account number
            @Valid @RequestBody AccountInput accountInput) {
        LOGGER.debug("Triggered AccountRestController.accountInput");

        // Validate input
        if (InputValidator.isSearchCriteriaValid(accountInput)) {
            // Attempt to retrieve the account information
            Account account = accountService.getAccount(
                    accountInput.getSortCode(), accountInput.getAccountNumber());

            // Return the account details, or warn that no account was found for given input
            if (account == null) {
                return new ResponseEntity<>(NO_ACCOUNT_FOUND, HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(account, HttpStatus.OK);
            }
        } else {
            return new ResponseEntity<>(INVALID_SEARCH_CRITERIA, HttpStatus.BAD_REQUEST);
        }
    }

}
