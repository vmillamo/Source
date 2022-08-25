package com.nttdata.webflux.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "person")
public class person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPerson;
    
    @Column(name = "fullName", nullable = false, length = 30)
    private String fullName;
    
    @Column(name = "typeDoc", nullable = false)
    private String typeDoc;
    
    @Column(name = "numberDoc", nullable = false, length = 30)
    private String numberDoc;
    
    @Column(name = "dateBirth", nullable = false)
    private LocalDate dateBirth;
    
    @Column(name = "email", nullable = false, length = 40)
    private String email;
    
    @Column(name = "phone", nullable = false)
    private Integer phone;
    
    @Column(name = "status", nullable = false, length = 1)
    private int status;
    
    @Column(name = "userCreation", nullable = false, length = 30)
    private String userCreation;
    
    @Column(name = "ipCreation", nullable = false, length = 30)
    private String ipCreation;
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idPerson == null) ? 0 : idPerson.hashCode());
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
        person other = (person) obj;
        if (idPerson == null) {
            if (other.idPerson != null)
                return false;
        } else if (!idPerson.equals(other.idPerson))
            return false;
        return true;
    }
}
