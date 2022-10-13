package Davivienda.DaviviendaCompras.repository;

import Davivienda.DaviviendaCompras.entity.Cliente;
import Davivienda.DaviviendaCompras.entity.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Cliente,Long>{

}
