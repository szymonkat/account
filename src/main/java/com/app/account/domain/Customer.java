package com.app.account.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;
/*
    @OneToMany(targetEntity = Account.class,
            fetch = FetchType.EAGER,
            mappedBy = "customer",
            cascade = CascadeType.MERGE)
    private List<Account> accounts = new ArrayList<>();*/

}
