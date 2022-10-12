package Davivienda.DaviviendaCompras.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int n_cuenta;
    private int cupo;
    private String movimientos;

    private Cuenta(){

    }

    public Cuenta(int n_cuenta, int cupo, String movimientos) {
        this.n_cuenta = n_cuenta;
        this.cupo = cupo;
        this.movimientos = movimientos;
    }

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
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
        return n_cuenta;
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
