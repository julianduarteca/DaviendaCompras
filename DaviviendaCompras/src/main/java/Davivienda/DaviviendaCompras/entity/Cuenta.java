package Davivienda.DaviviendaCompras.entity;

import lombok.Data;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@Table
public class Cuenta {
    @Id
    private long n_cuenta;
    private long cupo;
    @Column(length = 500)
    private String movimientos;


}
