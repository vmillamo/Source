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
@Table(name = "account_credit")
public class account_credit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCredit;
    
    @ManyToOne
    @JoinColumn(name = "idClient", nullable = false, foreignKey = @ForeignKey(name = "fk_client_credit"))
    private client idClient;
    
    @Column(name = "typeCurrency", nullable = false, length = 10)
    private String typeCurrency;    
    
    @Column(name = "accountNumber", nullable = false)
    private Integer accountNumber;
   
    @Column(name = "depositDate", nullable = false)
    private LocalDateTime depositDate;

    @Column(name = "balanceTotal", nullable = false)
    private Double balanceTotal;

    @Column(name = "balanceConsumed", nullable = false)
    private Double balanceConsumed;
    
    @Column(name = "countMonth", nullable = false)
    private Integer countMonth;

    @Column(name = "interest", nullable = false, length = 30)
    private String interest;

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idCredit == null) ? 0 : idCredit.hashCode());
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
        account_credit other = (account_credit) obj;
        if (idCredit == null) {
            if (other.idCredit != null)
                return false;
        } else if (!idCredit.equals(other.idCredit))
            return false;
        return true;
    }
}
