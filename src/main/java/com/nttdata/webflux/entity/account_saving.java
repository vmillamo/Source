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
@Table(name = "account_saving")
public class account_saving {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSaving;
    
    @ManyToOne
    @JoinColumn(name = "idClient", nullable = false, foreignKey = @ForeignKey(name = "fk_client_saving"))
    private client idClient;
    
    @Column(name = "typeSaving", nullable = false, length = 30)
    private String typeSaving;
    
    @Column(name = "typeCurrency", nullable = false, length = 10)
    private String typeCurrency;    
    
    @Column(name = "accountNumber", nullable = false)
    private Integer accountNumber;
    
    @Column(name = "typeAccount", nullable = false, length = 30)
    private String typeAccount;
    
    @Column(name = "registerDate", nullable = false)
    private LocalDateTime registerDate;

    @Column(name = "balance", nullable = false)
    private Double balance;
    
    @Column(name = "interest", nullable = false)
    private Double interest;
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idSaving == null) ? 0 : idSaving.hashCode());
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
        account_saving other = (account_saving) obj;
        if (idSaving == null) {
            if (other.idSaving != null)
                return false;
        } else if (!idSaving.equals(other.idSaving))
            return false;
        return true;
    }
}
