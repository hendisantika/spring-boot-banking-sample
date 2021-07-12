package com.hendisantika.springbootbankingsample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-banking-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/07/21
 * Time: 20.02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account", schema = "online_bank")
public class Account {

    @Id
    private long id;

    private String sortCode;

    private String accountNumber;

    private double currentBalance;

    private String bankName;

    private String ownerName;

    private transient List<Transaction> transactions;

}
