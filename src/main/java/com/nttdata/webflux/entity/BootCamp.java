package com.nttdata.webflux.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bootcamp")
public class BootCamp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBootCamp;
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idBootCamp == null) ? 0 : idBootCamp.hashCode());
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
        BootCamp other = (BootCamp) obj;
        if (idBootCamp == null) {
            if (other.idBootCamp != null)
                return false;
        } else if (!idBootCamp.equals(other.idBootCamp))
            return false;
        return true;
    }
}
