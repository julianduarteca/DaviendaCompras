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


    public long getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(long n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public long getCupo() {
        return cupo;
    }

    public void setCupo(long cupo) {
        this.cupo = cupo;
    }

    public String getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(String movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cuenta cuenta = (Cuenta) o;

        return n_cuenta == cuenta.n_cuenta;
    }

    @Override
    public int hashCode() {
        return (int) (n_cuenta ^ (n_cuenta >>> 32));
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "n_cuenta=" + n_cuenta +
                ", cupo=" + cupo +
                ", movimientos='" + movimientos + '\'' +
                '}';
    }
}
