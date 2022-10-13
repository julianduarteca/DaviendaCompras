package Davivienda.DaviviendaCompras.repository;

import Davivienda.DaviviendaCompras.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClientRepository extends JpaRepository<Cliente,Long>{
}
