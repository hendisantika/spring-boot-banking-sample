package com.hendisantika.springbootbankingsample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-banking-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/07/21
 * Time: 19.27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaction", schema = "online_bank")
@SequenceGenerator(name = "transaction_seq", sequenceName = "transaction_sequence", schema = "online_bank",
        initialValue = 5)
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_seq")
    private long id;

    private long sourceAccountId;

    private long targetAccountId;

    private String targetOwnerName;

    private double amount;

    private LocalDateTime initiationDate;

    private LocalDateTime completionDate;

    private String reference;

    private Double latitude;

    private Double longitude;
}
