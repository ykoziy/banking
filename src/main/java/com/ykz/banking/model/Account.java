package com.ykz.banking.model;

import com.ykz.banking.enums.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

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

    @ManyToMany(mappedBy = "accounts", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Set<User> users = new HashSet<>();

    public Account(Long userId, BigInteger balance, AccountStatus status) {
        this.userId = userId;
        this.balance = balance;
        this.status = status;
    }

    public Account(Long id, Long userId, BigInteger balance, AccountStatus status) {
        this.id = id;
        this.userId = userId;
        this.balance = balance;
        this.status = status;
    }

    public Account(Long userId, BigInteger balance, AccountStatus status, Set<User> users) {
        this.userId = userId;
        this.balance = balance;
        this.status = status;
        this.users = users;
    }
}

