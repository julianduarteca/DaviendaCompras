package Davivienda.DaviviendaCompras.repository;

import Davivienda.DaviviendaCompras.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Cliente,Long>{
}
