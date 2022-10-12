package Davivienda.DaviviendaCompras.entity;

import lombok.Data;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity

public class Consignacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_consignacion;
    private int cedula;
    private int n_cuenta;
    private int valor_consignacion;

    private Consignacion(){

    }

    public Consignacion(int id_consignacion, int cedula, int n_cuenta, int valor_consignacion) {
        this.id_consignacion = id_consignacion;
        this.cedula = cedula;
        this.n_cuenta = n_cuenta;
        this.valor_consignacion = valor_consignacion;
    }

    public int getId_consignacion() {
        return id_consignacion;
    }

    public void setId_consignacion(int id_consignacion) {
        this.id_consignacion = id_consignacion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public int getValor_consignacion() {
        return valor_consignacion;
    }

    public void setValor_consignacion(int valor_consignacion) {
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
        return id_consignacion;
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
