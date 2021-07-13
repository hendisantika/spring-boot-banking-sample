package com.hendisantika.springbootbankingsample.util;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-banking-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/07/21
 * Time: 18.08
 */
@Data
public class AccountInput {
    @NotBlank(message = "Sort code is mandatory")
    private String sortCode;

    @NotBlank(message = "Account number is mandatory")
    private String accountNumber;
}
