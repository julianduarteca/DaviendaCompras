package Davivienda.DaviviendaCompras.entity;


import lombok.Getter;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@Getter
@Builder
@Table
public class Compra {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id_compra;
    private long id_producto;
    private long n_cuenta;
    private long cedula;
    private long costo_compra;
    @Column(length = 50)
    private String hora;

}


