package Davivienda.DaviviendaCompras.entity;

import lombok.Data;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@Table
public class Productos {
    @Id
    private long id_producto;
    @Column(length = 250)
    private String decripcion;
    private long valor_producto;
    @Column(length = 1200)
    private String imagen_producto;


}
