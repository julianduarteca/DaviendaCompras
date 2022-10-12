package Davivienda.DaviviendaCompras.entity;


import lombok.Data;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity

public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_compra;
    private int id_producto;
    private int n_cuenta;
    private int cedula;
    private int costo_compra;
    private date hora;

    public Compra(){

    }

    public Compra(int id_compra, int id_producto, int n_cuenta, int cedula, int costo_compra, date hora) {
        this.id_compra = id_compra;
        this.id_producto = id_producto;
        this.n_cuenta = n_cuenta;
        this.cedula = cedula;
        this.costo_compra = costo_compra;
        this.hora = hora;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCosto_compra() {
        return costo_compra;
    }

    public void setCosto_compra(int costo_compra) {
        this.costo_compra = costo_compra;
    }

    public date getHora() {
        return hora;
    }

    public void setHora(date hora) {
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
        return id_compra;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "id_compra=" + id_compra +
                ", id_producto=" + id_producto +
                ", n_cuenta=" + n_cuenta +
                ", cedula=" + cedula +
                ", costo_compra=" + costo_compra +
                ", hora=" + hora +
                '}';
    }
}


