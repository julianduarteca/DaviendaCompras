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

    public long getId_compra() {
        return id_compra;
    }

    public void setId_compra(long id_compra) {
        this.id_compra = id_compra;
    }

    public long getId_producto() {
        return id_producto;
    }

    public void setId_producto(long id_producto) {
        this.id_producto = id_producto;
    }

    public long getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(long n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public long getCosto_compra() {
        return costo_compra;
    }

    public void setCosto_compra(long costo_compra) {
        this.costo_compra = costo_compra;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Compra compra = (Compra) o;

        return id_compra == compra.id_compra;
    }

    @Override
    public int hashCode() {
        return (int) (id_compra ^ (id_compra >>> 32));
    }

    @Override
    public String toString() {
        return "Compra{" +
                "id_compra=" + id_compra +
                ", id_producto=" + id_producto +
                ", n_cuenta=" + n_cuenta +
                ", cedula=" + cedula +
                ", costo_compra=" + costo_compra +
                ", hora='" + hora + '\'' +
                '}';
    }
}


