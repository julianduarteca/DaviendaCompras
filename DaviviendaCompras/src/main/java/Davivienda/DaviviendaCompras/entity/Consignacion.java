package Davivienda.DaviviendaCompras.entity;

import lombok.Data;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@Table
public class Consignacion {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id_consignacion;
    private long cedula;
    private long n_cuenta;
    private long valor_consignacion;



    public long getId_consignacion() {
        return id_consignacion;
    }

    public void setId_consignacion(long id_consignacion) {
        this.id_consignacion = id_consignacion;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public long getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(long n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public long getValor_consignacion() {
        return valor_consignacion;
    }

    public void setValor_consignacion(long valor_consignacion) {
        this.valor_consignacion = valor_consignacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Consignacion that = (Consignacion) o;

        return id_consignacion == that.id_consignacion;
    }

    @Override
    public int hashCode() {
        return (int) (id_consignacion ^ (id_consignacion >>> 32));
    }

    @Override
    public String toString() {
        return "Consignacion{" +
                "id_consignacion=" + id_consignacion +
                ", cedula=" + cedula +
                ", n_cuenta=" + n_cuenta +
                ", valor_consignacion=" + valor_consignacion +
                '}';
    }
}
