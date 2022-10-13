package Davivienda.DaviviendaCompras.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Cuenta {
    @Id
    private long n_cuenta;
    private long cupo;
    @Column(length = 500)
    private String movimientos;


}
