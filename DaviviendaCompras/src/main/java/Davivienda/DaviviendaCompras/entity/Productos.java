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

public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_producto;
    private String decripcion;
    private int valor_producto;
    private String imagen_producto;

    public Productos() {
    }

    public Productos(int id_producto, String decripcion, int valor_producto, String imagen_producto) {
        this.id_producto = id_producto;
        this.decripcion = decripcion;
        this.valor_producto = valor_producto;
        this.imagen_producto = imagen_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public int getValor_producto() {
        return valor_producto;
    }

    public void setValor_producto(int valor_producto) {
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
        return id_producto;
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
