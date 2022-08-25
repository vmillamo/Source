package com.nttdata.webflux.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account_fixed")
public class account_fixed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFixed;
    
    @ManyToOne
    @JoinColumn(name = "idClient", nullable = false, foreignKey = @ForeignKey(name = "fk_client_fixed"))
    private client idClient;
    
    @Column(name = "typeCurrency", nullable = false, length = 10)
    private String typeCurrency;    
    
    @Column(name = "accountNumber", nullable = false)
    private Integer accountNumber;
    
    @Column(name = "typeAccount", nullable = false, length = 30)
    private String typeAccount;
    
    @Column(name = "depositDate", nullable = false)
    private LocalDateTime depositDate;

    @Column(name = "deposit", nullable = false)
    private Double deposit;
    
    @Column(name = "balance", nullable = false)
    private Double balance;
    
    @Column(name = "countMonth", nullable = false)
    private Integer countMonth;

    @Column(name = "interestPay", nullable = false, length = 30)
    private String interestPay;

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idFixed == null) ? 0 : idFixed.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        account_fixed other = (account_fixed) obj;
        if (idFixed == null) {
            if (other.idFixed != null)
                return false;
        } else if (!idFixed.equals(other.idFixed))
            return false;
        return true;
    }
}
