package com.example.test1;

import java.security.PublicKey;
import java.time.LocalDateTime;

class Konstr1 {
    String name;
    LocalDateTime opened;
    double balance;

    public Konstr1 (Konstr1 acc) {
        name = acc.name;
        opened = LocalDateTime.now();
        balance = 0.0;
    }
    public Konstr1 (String name, LocalDateTime opened, double balance) {
        this.name = name;
        this.opened = opened;
        this.balance = balance;
    }

//    @Override
    public String toString () {
        return String.format("Имя: %s \nДата создания: %s \nБаланс: %f", name, opened, balance);
    }
}
