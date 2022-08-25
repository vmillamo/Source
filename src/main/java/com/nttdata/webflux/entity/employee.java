package com.nttdata.webflux.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "employee")
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmployee;
    
    @OneToOne
    @JoinColumn(name = "idPerson", nullable = false, foreignKey = @ForeignKey(name = "fk_person_employee"))
    private person person;
    
    @Column(name = "dateOfEntry", nullable = false)
    private LocalDateTime dateOfEntry;

    @Column(name = "userCreation", nullable = false, length = 30)
    private String userCreation;
    
    @Column(name = "ipCreation", nullable = false, length = 30)
    private String ipCreation;

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idEmployee == null) ? 0 : idEmployee.hashCode());
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
        employee other = (employee) obj;
        if (idEmployee == null) {
            if (other.idEmployee != null)
                return false;
        } else if (!idEmployee.equals(other.idEmployee))
            return false;
        return true;
    }
}
