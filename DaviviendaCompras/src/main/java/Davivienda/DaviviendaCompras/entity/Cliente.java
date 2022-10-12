package Davivienda.DaviviendaCompras.entity;

import lombok.Data;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cedula;
    private String nombre;
    private  int n_cuenta;

    public Cliente(){

    }

    public Cliente(int cedula, String nombre, int n_cuenta) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.n_cuenta = n_cuenta;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        return cedula == cliente.cedula;
    }

    @Override
    public int hashCode() {
        return cedula;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", n_cuenta=" + n_cuenta +
                '}';
    }
}
