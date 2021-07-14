package com.hendisantika.springbootbankingsample.util;

import lombok.Data;

import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-banking-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 14/07/21
 * Time: 10.46
 */
@Data
public class InputValidator {
    private static final Pattern sortCodePattern = Pattern.compile("^[0-9]{2}-[0-9]{2}-[0-9]{2}$");

    private static final Pattern accountNumberPattern = Pattern.compile("^[0-9]{8}$");
}
