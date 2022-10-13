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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return (int) (cedula ^ (cedula >>> 32));
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula=" + cedula +
                ", n_cuenta=" + n_cuenta +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
