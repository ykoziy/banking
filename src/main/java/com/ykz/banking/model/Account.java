package com.ykz.banking.model;

import com.ykz.banking.enums.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(columnDefinition = "BIGINT NOT NULL DEFAULT 0")
    private BigInteger balance;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountStatus status;
}
