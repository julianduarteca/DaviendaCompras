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
public class Cliente {
    @Id
    private long cedula;
    private  long n_cuenta;
    @Column(length = 250)
    private String nombre;


}
