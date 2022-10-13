package Davivienda.DaviviendaCompras.repository;

import Davivienda.DaviviendaCompras.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends JpaRepository<Productos,Long>{
}
