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



    public long getId_producto() {
        return id_producto;
    }

    public void setId_producto(long id_producto) {
        this.id_producto = id_producto;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public long getValor_producto() {
        return valor_producto;
    }

    public void setValor_producto(long valor_producto) {
        this.valor_producto = valor_producto;
    }

    public String getImagen_producto() {
        return imagen_producto;
    }

    public void setImagen_producto(String imagen_producto) {
        this.imagen_producto = imagen_producto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Productos productos = (Productos) o;

        return id_producto == productos.id_producto;
    }

    @Override
    public int hashCode() {
        return (int) (id_producto ^ (id_producto >>> 32));
    }

    @Override
    public String toString() {
        return "Productos{" +
                "id_producto=" + id_producto +
                ", decripcion='" + decripcion + '\'' +
                ", valor_producto=" + valor_producto +
                ", imagen_producto='" + imagen_producto + '\'' +
                '}';
    }
}
